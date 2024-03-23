package com.example.demoweb.service;

import com.example.demoweb.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// be cautious the singleton is not thread safe, never use below approach
// in production
@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> findAll(){
        return products;
    }
}
