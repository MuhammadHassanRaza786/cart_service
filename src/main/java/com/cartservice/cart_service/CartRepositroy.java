package com.cartservice.cart_service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
@Service
public interface CartRepositroy extends JpaRepository<Cart,Long>{
    
}
