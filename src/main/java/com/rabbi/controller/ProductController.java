package com.rabbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbi.model.Product;
import com.rabbi.product.service.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {
   @Autowired
   ProductService productservice;
	
	@PostMapping("/save-product")
	public Product saveProduct(@RequestBody Product product) {
       System.out.println( product.getProductName());
		return productservice.saveProduct(product);

	}
	 @GetMapping("/showe-product")
	    public List<Product> showProduct(){
	        List <Product> ProductList  =  productservice.getAll();
	    	return ProductList;
	    }
	 @DeleteMapping("{id}")
	 public List<Product>deleteProduct(@PathVariable long id){
		 
		 productservice.delete(id);
		 return productservice.getAll();
	 }
	 @GetMapping("{id}")
	    public Product showProduct(@PathVariable long id){
		 Product ProductList  =  productservice.getById(id);
	    	return ProductList;
	    }
	 @PostMapping("/update-product")
		public boolean updateProduct(@RequestBody Product product) {
	       System.out.println( product.getProductName());
			return productservice.update(product);

		}
}
