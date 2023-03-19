package com.example.productservice.service;

import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreateProductResponse;
import com.example.productservice.dto.response.UpdateProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();
    ProductDto getOne(Long id);
    CreateProductResponse add(CreateProductRequest request);
    UpdateProductResponse update(UpdateProductRequest request);
    void delete(Long id);

}
