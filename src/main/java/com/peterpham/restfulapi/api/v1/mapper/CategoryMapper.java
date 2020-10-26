package com.peterpham.restfulapi.api.v1.mapper;

import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);

    Category categoryDtoToCategory(CategoryDTO categoryDTO);


}
