package com.peterpham.restfulapi.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

//    private Long id;

    private String name;

    private String address;

    private String customerUrl;



}
