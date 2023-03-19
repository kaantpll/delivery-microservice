package com.example.productservice.mapper;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper instance = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "name",target = "name")
    @Mapping(source = "price",target="price")
    @Mapping(source = "stock",target="stock")
    @Mapping(source = "imgUrl",target="imgUrl")
    ProductDto toDto(Product from);

    @InheritInverseConfiguration(name = "toDto")
    Product fromDto(ProductDto from);
}
