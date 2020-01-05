package com.rabbi.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbi.model.Product;
import com.rabbi.product.dao.ProductDao;
@Service
@Transactional
public class ProductServiceImp implements ProductService{
      
 @Autowired
 ProductDao productDao;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.saveProduct(product);
	}

	@Override
	public boolean update(Product product) {
		boolean bole= productDao.update(product);
		return bole;
	}

	@Override
	public boolean delete(long id) {
		
		return productDao.delete(id);
	}

	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}

	@Override
	public Product getById(long id) {
		
		return productDao.getById(id);
	}

	

}
