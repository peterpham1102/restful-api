package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.model.CategoryDTO;



import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);

    CategoryDTO getCategoryById(Long id);

    CategoryDTO createNewCategory(CategoryDTO categoryDTO);

    CategoryDTO saveCategoryByDTO(Long id, CategoryDTO categoryDTO);

    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);

    CategoryDTO patchCategory(Long id, CategoryDTO categoryDTO);

    void deleteCategoryById(Long id);




}
