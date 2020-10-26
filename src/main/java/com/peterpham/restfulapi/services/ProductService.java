package com.peterpham.restfulapi.services;

import com.peterpham.restfulapi.api.v1.model.ProductDTO;


import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductByName();

    ProductDTO getProductById(Long id);

    ProductDTO createNewProduct(ProductDTO productDTO);

    ProductDTO saveProductByDTO(Long id, ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    ProductDTO patchProduct(Long id, ProductDTO productDTO);

    void deleteProductById(Long id);

}
