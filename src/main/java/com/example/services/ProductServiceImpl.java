package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
	private ProductRepository repo;
	
	@Autowired
	public void setProductRepository( ProductRepository prep){
		this.repo = prep;
	}

	@Override
	public Iterable<Product> listAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return repo.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		repo.delete(id);
	}

}
