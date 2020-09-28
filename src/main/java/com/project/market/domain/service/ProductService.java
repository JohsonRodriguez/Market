package com.project.market.domain.service;

import com.project.market.domain.Product;
import com.project.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
    return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        
    }
}
