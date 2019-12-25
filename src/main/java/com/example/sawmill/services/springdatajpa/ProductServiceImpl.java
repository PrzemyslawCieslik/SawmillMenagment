package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Product;
import com.example.sawmill.repositories.ProductRepository;
import com.example.sawmill.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByWidth(int width) {
        return productRepository.findByWidth(width);
    }

    @Override
    public Product findByLength(int length) {
        return productRepository.findByLength(length);
    }

    @Override
    public Product findByHeight(int height) {
        return productRepository.findByHeight(height);
    }

    @Override
    public Product findByName(String productName) {
        return productRepository.findByName(productName);
    }

    @Override
    public List<Product> findAllByWidth(int width) {
        return productRepository.findAllByWidth(width);
    }

    @Override
    public List<Product> findAllByLength(int length) {
        return productRepository.findAllByLength(length);
    }

    @Override
    public List<Product> findAllByHeight(int height) {
        return productRepository.findAllByHeight(height);
    }

    @Override
    public List<Product> findAllByName(String productName) {
        return productRepository.findAllByName(productName);
    }

    @Override
    public Set<Product> findAll() {
        Set<Product> products = new HashSet<>();
        productRepository.findAll().forEach(products::add);
        return null;
    }

    @Override
    public Product findById(Long aLong) {
        return productRepository.findById(aLong).orElse(null);
    }

    @Override
    public Product save(Product object) {
        return productRepository.save(object);
    }

    @Override
    public void delete(Product object) {
        productRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }
}
