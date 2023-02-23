package com.cartservice.cart_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepositroy cartRepo;

    @PostMapping("/add")
    public Cart saveCart(@RequestBody Cart cart){
        return cartRepo.save(cart);
    }

    @GetMapping("/all")
    public List<Cart> getAllCart(){
        return cartRepo.findAll();
    }

    @DeleteMapping("/remove")
    void deleteAllCarts(){
        cartRepo.deleteAll();
    }

    @DeleteMapping("/{id}")
    void deleteCartById(@PathVariable Long id){
        cartRepo.deleteById(id);
    }

    
    
    
}
