package com.example.services;

import org.springframework.stereotype.Service;

import com.example.domain.Product;

@Service
public interface ProductService {

	Iterable<Product> listAllProducts();
	
	Product getProductById(Long id);
	Product saveProduct(Product product);
	void deleteProduct(Long id);
}
