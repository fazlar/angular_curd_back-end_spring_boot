package com.rabbi.product.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rabbi.model.Product;
@Repository
public class ProductDaoImp implements ProductDao {
	@Autowired
    SessionFactory sessionFactory;
	@Override
	public Product saveProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return (product) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public boolean update(Product product) {
		try {  
            sessionFactory.getCurrentSession().update(product);  
            return true;  
        } catch (Exception e) {  
        	return false;  
        }
		
	}

	@Override
	public boolean delete(long id) {
		try {
			Product product = sessionFactory.getCurrentSession().get(Product.class, id);
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public List<Product> getAll() {
		try {
			List<Product> productList = (List<Product>) sessionFactory.getCurrentSession().createQuery("FROM Product").setFetchSize(50).list();
			return productList;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public Product getById(long id) {
		try {
			Product product =  sessionFactory.getCurrentSession().get(Product.class, id);
			return product;
		} catch (HibernateException e) {
			return null;
		}
	}

}
