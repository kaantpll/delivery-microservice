package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.dto.request.CreateOrderRequest;
import com.example.orderservice.dto.response.CreatedOrderResponse;
import com.example.orderservice.dto.response.UpdatedOrderResponse;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAll();
    OrderDto getOne(String id);
    CreatedOrderResponse placeOrder(CreateOrderRequest request);
    UpdatedOrderResponse update(String id, UpdatedOrderResponse request);
    void delete(String id);

}
