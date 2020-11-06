package com.example.demo.repository;


import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;


import java.util.Set;

public interface ProductRepository extends CrudRepository<Product,Long> {

    //Set<Product>findAllByName(String name);
    //ingen ide om hvad det her set bruges til. Det skal være hjælpe med at mappe noget?

}
