package com.rabbi.product.dao;

import java.util.List;

import com.rabbi.model.Product;

public interface ProductDao {
	public Product saveProduct(Product product);
    public boolean update(Product product);
    public boolean delete(long id);
    public List<Product> getAll();
    public Product getById(long id);
	
	
}
