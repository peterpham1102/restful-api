package com.peterpham.restfulapi.api.v1.model;

import lombok.Data;

import java.util.List;

@Data
public class CustomerListDTO {

    List<CustomerListDTO> customers;
}
