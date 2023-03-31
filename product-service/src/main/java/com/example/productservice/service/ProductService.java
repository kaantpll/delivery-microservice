package com.example.productservice.service;

import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreatedProductResponse;
import com.example.productservice.dto.response.ProductResponse;
import com.example.productservice.dto.response.UpdatedProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();
    ProductDto getOne(String id);
    CreatedProductResponse add(CreateProductRequest request);
    UpdatedProductResponse update(String id, UpdateProductRequest request);

    void reduceQuantity(String productId,long quantity);
    void delete(String id);

}
