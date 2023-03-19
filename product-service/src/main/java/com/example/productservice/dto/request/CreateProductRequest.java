package com.example.productservice.dto.request;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    @NotBlank(message = "Name is mandatory")
    String name;
    @NotBlank(message = "Price is mandatory")
    Long price;
    @NotBlank(message = "Stock is mandatory")
    Long stock;
    @Nullable
    String imgUrl;
}
