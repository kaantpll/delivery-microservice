package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.dto.request.CreateOrderRequest;
import com.example.orderservice.dto.response.CreatedOrderResponse;
import com.example.orderservice.dto.response.UpdatedOrderResponse;
import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderStatus;
import com.example.orderservice.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;


@Log4j2
@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    @Autowired
    private APIClient apiClient;
    public OrderServiceImpl( OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDto> getAll() {
        return null;
    }

    @Override
    public OrderDto getOne(String id) {
        return null;
    }

    @Override
    public CreatedOrderResponse placeOrder(CreateOrderRequest request) {
        log.info("Placing order request");


        apiClient.reduceQuantity(request.getProductId(),request.getQuantity());

        Order order = Order.builder()
                .amount(request.getAmount())
                .orderStatus(OrderStatus.CREATED)
                .productId(request.getProductId())
                .orderDate(Instant.now())
                .quantity(request.getQuantity())
                .build();

        order = orderRepository.save(order);



        log.info("Order placed. Order id : "+order.getId());

        CreatedOrderResponse response = new CreatedOrderResponse();
        response.setProductId(order.getProductId());

        return response;
    }

    @Override
    public UpdatedOrderResponse update(String id, UpdatedOrderResponse request) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
