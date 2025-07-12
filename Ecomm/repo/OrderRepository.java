package com.ecom.Ecomm.repo;

import com.ecom.Ecomm.modal.Orders;
import com.ecom.Ecomm.modal.Product;
import com.ecom.Ecomm.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Long> {

    @Query("SELECT o from Orders o Join FETCH o.user") //THis is a JPA query not SQL
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);
}
