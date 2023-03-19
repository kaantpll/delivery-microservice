package com.example.productservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    String name;
    Long price;
    Long stock;
    String imgUrl;
}
