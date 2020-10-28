package com.peterpham.restfulapi.api.v1.mapper;

import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {
    public static final String NAME = "T-Shirt";
    public static final String DESCRIPTION = "This is category of T-shirt";

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    void categoryToCategoryDTO() {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setDescription(DESCRIPTION);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(NAME, categoryDTO.getName());
        assertEquals(DESCRIPTION, categoryDTO.getDescription());
    }

    @Test
    void categoryDtoToCategory() {
    }
}