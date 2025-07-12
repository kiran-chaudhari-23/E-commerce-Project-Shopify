package com.ecom.Ecomm.repo;

import com.ecom.Ecomm.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

}
