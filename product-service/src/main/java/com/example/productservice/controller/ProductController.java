package com.example.productservice.controller;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.dto.request.CreateProductRequest;
import com.example.productservice.dto.request.UpdateProductRequest;
import com.example.productservice.dto.response.CreateProductResponse;
import com.example.productservice.dto.response.UpdateProductResponse;
import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.media.MediaType;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Tag(name = "Product Service API v1", description = "Product Service ")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ProductDto>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    @Operation(
            method = "GET",
            summary = "get product with id",
            description = "",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "",
                            content = @Content(
                                    array = @ArraySchema(schema = @Schema(implementation = Product.class))
                            )
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Product id is not exist",
                            content = @Content(schema = @Schema(hidden = true))
                    ),
            }
    )
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ProductDto> getOne(@PathVariable String id){
        return ResponseEntity.ok(productService.getOne(id));
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CreateProductResponse> create(@Valid @RequestBody CreateProductRequest createProductRequest){
        return ResponseEntity.ok(productService.add(createProductRequest));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UpdateProductResponse> update(@RequestBody UpdateProductRequest updateProductRequest, @PathVariable String id){
        return ResponseEntity.ok(productService.update(id,updateProductRequest));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id){
        productService.delete(id);
    }

}
