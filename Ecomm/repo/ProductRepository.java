package com.ecom.Ecomm.repo;

import com.ecom.Ecomm.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
