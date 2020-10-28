package com.peterpham.restfulapi.controllers.v1;

import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.api.v1.model.CategoryListDTO;
import com.peterpham.restfulapi.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getCategoryList(){
        return new CategoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping({"/id"})
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryById(@PathVariable Long id ){
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDTO createNewCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.createNewCategory(categoryDTO);
    }

    @PutMapping({"/id"})
    @ResponseStatus(HttpStatus.OK)
    public  CategoryDTO updateCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO){
        return categoryService.saveCategoryByDTO(id, categoryDTO);
    }

    @PatchMapping({"/id"})
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO patchCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO){
        return categoryService.patchCategory(id, categoryDTO);
    }

    @DeleteMapping({"/id"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }



}
