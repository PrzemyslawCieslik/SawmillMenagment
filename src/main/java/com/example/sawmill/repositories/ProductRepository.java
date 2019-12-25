package com.example.sawmill.repositories;

import com.example.sawmill.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByWidth (int width);

    Product findByLength (int length);

    Product findByHeight (int height);

    Product findByName (String productName);

    List<Product> findAllByWidth (int width);

    List<Product> findAllByLength (int length);

    List<Product> findAllByHeight (int height);

    List<Product> findAllByName (String productName);

}
