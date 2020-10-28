package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.mapper.CategoryMapper;
import com.peterpham.restfulapi.api.v1.model.CategoryDTO;
import com.peterpham.restfulapi.controllers.v1.CategoryController;
import com.peterpham.restfulapi.domain.Category;
import com.peterpham.restfulapi.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl( CategoryMapper categoryMapper ,CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        return categoryRepository
                .findAll()
                .stream()
                .map(category -> {
                    CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);
                    categoryDTO.setCategoryUrl(getCategoryUrl(category.getId()));
                    return categoryDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {

        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .map(categoryMapper::categoryToCategoryDTO)
                .map(categoryDTO -> {
                    categoryDTO.setCategoryUrl(getCategoryUrl(id));
                    return categoryDTO;
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    private String getCategoryUrl(Long id) {
        return CategoryController.BASE_URL + "/" + id;
    }

    @Override
    public CategoryDTO createNewCategory(CategoryDTO categoryDTO) {
        return saveAndReturnDTO(categoryMapper.categoryDtoToCategory(categoryDTO));
    }

    private CategoryDTO  saveAndReturnDTO(Category category){

        Category savedCategory = categoryRepository.save(category);

        CategoryDTO returnDto = categoryMapper.categoryToCategoryDTO(savedCategory);

        returnDto.setCategoryUrl(getCategoryUrl(savedCategory.getId()));

        return returnDto;
    }

    @Override
    public CategoryDTO saveCategoryByDTO(Long id, CategoryDTO categoryDTO) {

        Category category = categoryMapper.categoryDtoToCategory(categoryDTO);
        category.setId(id);

        return saveAndReturnDTO(category);
    }

    @Override
    public CategoryDTO patchCategory(Long id, CategoryDTO categoryDTO) {

        return categoryRepository.findById(id).map(category -> {

            if (categoryDTO.getName() != null){
                category.setName(categoryDTO.getName());
            }

            if (categoryDTO.getDescription() != null){
                category.setDescription(categoryDTO.getDescription());
            }

            CategoryDTO returnDto = categoryMapper.categoryToCategoryDTO(categoryRepository.save(category));

            returnDto.setCategoryUrl(getCategoryUrl(id));

            return returnDto;
        }).orElseThrow(ResourceNotFoundException::new);
    }

//    @Override
//    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) {
//
//        return null;
//    }

    @Override
    public void deleteCategoryById(Long id) {

        categoryRepository.deleteById(id);

    }
}
