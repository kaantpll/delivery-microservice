package com.example.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service",path = "/api/v1/products/")
public interface APIClient {

    @PutMapping("/reduce-quantity/{id}")
     ResponseEntity<Void> reduceQuantity(@PathVariable("id") String productId, @RequestParam long quantity);

}