package com.example.productservice.service;

import com.example.productservice.constants.ErrorMessages;
import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreatedProductResponse;
import com.example.productservice.dto.response.UpdatedProductResponse;
import com.example.productservice.entity.Product;
import com.example.productservice.mapper.ProductMapper;
import com.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDto> getAll() {

        return productRepository.findAll().stream().map(productMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto getOne(String id) {
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException(ErrorMessages.PRODUCT_NOT_FOUND));
        return productMapper.toDto(product);
    }

    @Override
    public CreatedProductResponse add(CreateProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .imgUrl(request.getImgUrl())
                .stock(request.getStock())
                .build();

        productRepository.save(product);

        CreatedProductResponse response = CreatedProductResponse.builder()
                .name(product.getName())
                .stock(product.getStock())
                .imgUrl(product.getImgUrl())
                .price(product.getPrice())
                .build();

        return response;
    }

    @Override
    public UpdatedProductResponse update(String id, UpdateProductRequest request) {
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException(ErrorMessages.PRODUCT_NOT_FOUND));

        Product updatedProduct = Product.builder()
                .name(product.getName())
                .stock(product.getStock())
                .imgUrl(product.getImgUrl())
                .price(product.getPrice())
                .build();

        productRepository.save(updatedProduct);

        UpdatedProductResponse response = UpdatedProductResponse.builder()
                .name(product.getName())
                .stock(product.getStock())
                .imgUrl(product.getImgUrl())
                .price(product.getPrice())
                .build();


        return response;
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }
}
