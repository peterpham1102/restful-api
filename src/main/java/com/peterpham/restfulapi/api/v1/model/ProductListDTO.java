package com.peterpham.restfulapi.api.v1.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductListDTO {

    List<ProductListDTO> products;
}
