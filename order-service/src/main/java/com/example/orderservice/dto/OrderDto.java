package com.example.orderservice.dto;

import com.example.orderservice.entity.OrderStatus;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String productId;
    private long quantity;
    private Instant orderData;
    private long amount;
    private OrderStatus orderStatus;
}
