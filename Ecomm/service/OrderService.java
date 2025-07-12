package com.ecom.Ecomm.service;

import com.ecom.Ecomm.dto.OrderDTO;
import com.ecom.Ecomm.dto.OrderItemDTO;
import com.ecom.Ecomm.modal.OrderItem;
import com.ecom.Ecomm.modal.Orders;
import com.ecom.Ecomm.modal.Product;
import com.ecom.Ecomm.modal.User;
import com.ecom.Ecomm.repo.OrderRepository;
import com.ecom.Ecomm.repo.ProductRepository;
import com.ecom.Ecomm.repo.UserRepository;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    public OrderDTO placeOrder(Long userId, Map<Long, Integer> productQuantities, double totalAmount) {

        User user = userRepository.findById(userId)
        .orElseThrow(()->new RuntimeException("User not found"));

        Orders order=new Orders();

        order.setUser(user);
        order.setOrderDate(new Date());
        order.setStatus("Pending");
        order.setTotalAmount(totalAmount);

        List<OrderItem> orderItems=new ArrayList<>();
        List<OrderItemDTO> orderItemDTOS=new ArrayList<>();

        for (Map.Entry<Long, Integer> entry:productQuantities.entrySet())
        {
            Product product= productRepository.findById(entry.getKey()).
                    orElseThrow(()->new RuntimeException("Product Not Found"));

            OrderItem orderItem=new OrderItem();
            orderItem.setOrder(order);
            orderItem.setProduct(product);
            orderItem.setQuantity(entry.getValue());

            orderItems.add(orderItem); //Ethach add hote aahe

            orderItemDTOS.add(new OrderItemDTO(product.getName(),product.getPrice(),entry.getValue()));
            //he order Dto save object


        }
        order.setOrderItem(orderItems);
        Orders saveOrder= orderRepository.save(order);
        return new OrderDTO(saveOrder.getId(),saveOrder.getTotalAmount(),saveOrder.getStatus(),saveOrder.getOrderDate(),orderItemDTOS);
    }

    public List<OrderDTO> getAllOrders() {
       List<Orders> orders=orderRepository.findAllOrdersWithUsers(); //This not Jpa query then create the method in repositroy in side

        return orders.stream().map(this::convertTODTO).collect(Collectors.toList());
    }

    private OrderDTO convertTODTO(Orders orders) {

        List<OrderItemDTO> OrderItems = orders.getOrderItem().stream()
                .map(item -> new OrderItemDTO(
                        item.getProduct().getName(),
                        item.getProduct().getPrice(),
                        item.getQuantity())).collect(Collectors.toList());
        return new OrderDTO(
                orders.getId(),
                orders.getTotalAmount(),
                orders.getStatus(),
                orders.getOrderDate(),
                orders.getUser()!=null ? orders.getUser().getName() : "Unknown",
                orders.getUser()!=null ? orders.getUser().getEmail() : "Unknown",
                OrderItems
        );
    }


    public List<OrderDTO> getOrderByUser(Long userId) {
        Optional<User>userOp= userRepository.findById(userId);

        if(userOp.isEmpty()){
            throw new RuntimeException("User not found");

        }

        User user= userOp.get();
        List<Orders> ordersList= orderRepository.findByUser(user);

        return ordersList.stream().map(this::convertTODTO).collect(Collectors.toList());
    }
}
