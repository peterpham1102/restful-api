package com.peterpham.restfulapi.api.v1.mapper;

import com.peterpham.restfulapi.api.v1.model.ProductDTO;
import com.peterpham.restfulapi.domain.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO productToProductDto(Product product);

    Product productDtoToProduct(ProductDTO productDTO);
}
