package com.peterpham.restfulapi.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

//    private Long id;

    private String name;

    private String description;

    private String categoryUrl;
}
