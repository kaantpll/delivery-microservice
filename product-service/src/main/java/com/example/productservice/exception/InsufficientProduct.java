package com.example.productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InsufficientProduct extends RuntimeException{
    public InsufficientProduct(String message) {
        super(message);
    }
}
