package com.example.orderservice.dto.response;

import com.example.orderservice.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedOrderResponse {
    private String id;
    private String productId;
    private long quantity;
    private long amount;
}
