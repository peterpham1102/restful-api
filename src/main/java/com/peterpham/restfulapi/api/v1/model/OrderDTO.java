package com.peterpham.restfulapi.api.v1.model;

import lombok.Data;

@Data
public class OrderDTO {

    private Long id;
    private String name;
    private String status;
}
