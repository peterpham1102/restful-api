package com.peterpham.restfulapi.api.v1.model;

import lombok.Data;


@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private String price;
}
