package com.example.productservice.service;

import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreateProductResponse;
import com.example.productservice.dto.response.UpdateProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();
    ProductDto getOne(String id);
    CreateProductResponse add(CreateProductRequest request);
    UpdateProductResponse update(String id,UpdateProductRequest request);
    void delete(String id);

}
