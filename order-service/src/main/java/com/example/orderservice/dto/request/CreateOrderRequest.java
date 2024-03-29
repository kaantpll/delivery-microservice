package com.example.orderservice.dto.request;

import com.example.orderservice.entity.OrderStatus;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    private String productId;
    private long quantity;
    private Instant orderDate;
    private long amount;
}
