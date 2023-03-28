package com.example.productservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatedProductResponse {
    private String id;
    private String name;
    private Long price;
    private Long stock;
    private String imgUrl;
}
