package com.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    //Logging
    //Authentication & Auhorization
    //Sanitize the data
    public void checkout(String status){
        System.out.println("checkout method from Shopping cart called");
    }

    public int quantity(){
        return 2;
    }
}
