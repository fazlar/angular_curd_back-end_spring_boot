package com.rabbi.catagory.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rabbi.model.Catagory;

@Repository
public class CatagorydaoImp implements CatagoryDao {
	@Autowired
    SessionFactory sessionFactory;
	@Override
	public Catagory saveCatagory(Catagory catagory) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(catagory);;
			return (catagory) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public boolean update(Catagory catagory) {
		try {  
            sessionFactory.getCurrentSession().update(catagory);  
            return true;  
        } catch (Exception e) {  
        	return false;  
        }
	}

	@Override
	public boolean delete(long id) {
		try {
			Catagory catagory = sessionFactory.getCurrentSession().get(Catagory.class, id);
			sessionFactory.getCurrentSession().delete(catagory);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public List<Catagory> getAll() {
		try {
			List<Catagory> CatagoryList = (List<Catagory>) sessionFactory.getCurrentSession().createQuery("FROM Catagory").setFetchSize(50).list();
			return CatagoryList;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public Catagory getById(long id) {
		try {
			Catagory catagory =  sessionFactory.getCurrentSession().get(Catagory.class, id);
			return catagory;
		} catch (HibernateException e) {
			return null;
		}
	}

	
}
