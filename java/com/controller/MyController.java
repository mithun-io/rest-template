package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClient;
// import org.springframework.web.client.RestTemplate;

import com.entity.Products;
import com.entity.User;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MyController {

	// private final RestTemplate restTemplate;
    private final RestClient restClient;

    @GetMapping("/")
    public String getMethodName() {
        return "main.html";
    }

    @GetMapping("/users")
    public String loadUsers(ModelMap map) {
        // User[] users = restTemplate.getForObject("https://api.mydummyapi.com/users", User[].class);
    	User[] users = restClient.get()
                .uri("https://api.mydummyapi.com/users")
                .retrieve()
                .body(User[].class);
        map.put("users", users);
        return "users.html";
    }

    @GetMapping("/products")
    public String loadProducts(ModelMap map) {
        // Products products = restTemplate.getForObject("https://dummyjson.com/products", Products.class);
    	   Products products = restClient.get()
                   .uri("https://dummyjson.com/products")
                   .retrieve()
                   .body(Products.class);
    	map.put("products", products.getProducts());
        return "products.html";
    }

}
