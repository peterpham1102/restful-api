package com.peterpham.restfulapi.bootstrap;

import com.peterpham.restfulapi.domain.Category;
import com.peterpham.restfulapi.domain.Customer;
import com.peterpham.restfulapi.domain.Product;
import com.peterpham.restfulapi.repositories.CategoryRepository;
import com.peterpham.restfulapi.repositories.CustomerRepository;
import com.peterpham.restfulapi.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;

public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomer();
        loadProduct();

        System.out.println("Hello WTF");

    }

    private void loadCategories(){
        Category tShirt = new Category();
        tShirt.setId(1l);
        tShirt.setName("T-Shirt");
        tShirt.setDescription("This is category of T-shirt");

        categoryRepository.save(tShirt);

        Category hoodie = new Category();
        hoodie.setId(2l);
        hoodie.setName("Hoodie");
        hoodie.setDescription("This is category of Hoodie");

        categoryRepository.save(hoodie);

        Category sweatShirt = new Category();
        sweatShirt.setId(3l);
        sweatShirt.setName("SweatShirt");
        sweatShirt.setDescription("This is category of Sweatshirt");

        categoryRepository.save(sweatShirt);

        Category zipHoodie = new Category();
        zipHoodie.setId(4l);
        zipHoodie.setName("Zip Hoodie");
        zipHoodie.setDescription("This is category of Zip Hoodie");

        categoryRepository.save(zipHoodie);

        System.out.println("Categories loaded " + categoryRepository.count());

    }

    private void loadCustomer(){
        Customer cus1 = new Customer();
        cus1.setName("Cus1");
        cus1.setAddress("HN");

        customerRepository.save(cus1);

        System.out.println("Customers loaded " + customerRepository.count());


    }


    private void loadProduct(){
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setPrice("100$");
        product1.setDescription("This is product");

        productRepository.save(product1);
        System.out.println("Products loaded " + productRepository.count());
    }


}
