package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.mapper.CategoryMapper;
import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.domain.Category;
import com.peterpham.restfulapi.repositories.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


class CategoryServiceImplTest {

    @Mock
    CategoryRepository categoryRepository;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    CategoryService categoryService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        categoryService = new CategoryServiceImpl(categoryMapper, categoryRepository);
    }

    @Test
    void getAllCategories() {
        //given
        Category tShirt = new Category();
        tShirt.setId(1l);
        tShirt.setName("T-Shirt");
        tShirt.setDescription("This is category of T-shirt");

        Category hoodie = new Category();
        hoodie.setId(1l);
        hoodie.setName("Hoodie");
        hoodie.setDescription("This is category of Hoodie");

        when(categoryRepository.findAll()).thenReturn(Arrays.asList(tShirt, hoodie));

        //when
        List<CategoryDTO> categoryDTOS = categoryService.getAllCategories();

        assertEquals(2, categoryDTOS.size());



    }

    @Test
    void getCategoryByName() {
    }

    @Test
    void getCategoryById() {
    }

    @Test
    void createNewCategory() {
    }

    @Test
    void saveCategoryByDTO() {
    }

    @Test
    void patchCategory() {
    }

    @Test
    void deleteCategoryById() {
    }
}