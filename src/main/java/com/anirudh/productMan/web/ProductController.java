package com.anirudh.productMan.web;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.anirudh.productMan.core.*;

@RestController
public class ProductController {
    @Autowired
	 private ProductRepository repository;
	@RequestMapping("/products")
	 public Iterable<Product> getProducts() {
	 // Fetch and return products
		return repository.findAll();
	 }
}
