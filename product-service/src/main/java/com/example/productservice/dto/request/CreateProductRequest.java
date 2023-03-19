package com.example.productservice.dto.request;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {


    @NotNull(message = "Name is not null")
    @Size(min = 3,message = "Name should be grater than 3.")
    String name;

    @NotNull(message = "Price is mandatory")
    Long price;

    @NotNull(message = "Stock is mandatory")
    Long stock;

    @Nullable
    String imgUrl;
}
