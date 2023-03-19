package com.example.productservice.service;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreateProductResponse;
import com.example.productservice.dto.response.UpdateProductResponse;
import com.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto getOne(Long id) {
        return null;
    }

    @Override
    public CreateProductResponse add(CreateProductRequest request) {
        return null;
    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
