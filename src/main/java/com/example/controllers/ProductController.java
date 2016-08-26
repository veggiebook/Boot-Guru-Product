package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Product;
import com.example.services.ProductService;

@Controller
public class ProductController {
	
	private ProductService service;
	
	@Autowired
	public void setService(ProductService serv) {this.service = serv;}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("products",service.listAllProducts());
		System.out.println("Returning rProducts");
		return "products";
	}
	
	@RequestMapping("product/{id}")
	public String showProduct(@PathVariable Long id, Model model){
		model.addAttribute("product", service.getProductById(id));
		return "productshow";
	}
	
	@RequestMapping("product/new")
	public String newProduct(Model model){
		model.addAttribute("product", new Product());
		return "productform";
	}
	
	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product prod){
		service.saveProduct(prod);
		return "redirect:/product/" + prod.getId();
	}
	
	@RequestMapping("product/delete/{id}")
	public String delete(@PathVariable Long id){
		service.deleteProduct(id);
		return "redirect:/products";
	}
}
