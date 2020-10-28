package com.peterpham.restfulapi.controllers.v1;

import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.controllers.RestResponseEntityExceptionHandler;
import com.peterpham.restfulapi.services.CategoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;

class CategoryControllerTest {

    public static final String NAME = "T-Shirt";
    public static final String DESCRIPTION = "This is description for T-Shirt";

    @Mock
    CategoryService categoryService;

    @InjectMocks
    CategoryController categoryController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(categoryController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();

    }

    @Test
    void getCategoryList() {



    }

    @Test
    void getCategoryById() {
    }

    @Test
    void createNewCategory() {
    }

    @Test
    void updateCategory() {
    }

    @Test
    void patchCategory() {
    }

    @Test
    void deleteCategory() {
    }
}