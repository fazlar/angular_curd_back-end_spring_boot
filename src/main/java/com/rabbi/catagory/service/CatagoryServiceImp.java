package com.rabbi.catagory.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbi.catagory.dao.CatagoryDao;
import com.rabbi.model.Catagory;
@Service
@Transactional
public class CatagoryServiceImp implements CatagoryService {
    @Autowired
    CatagoryDao catagoryDao;
	
	@Override
	public Catagory saveCatagory(Catagory catagory) {
		
		return catagoryDao.saveCatagory(catagory);
	}

	@Override
	public boolean update(Catagory catagory) {
		
		return catagoryDao.update(catagory);
	}

	@Override
	public boolean delete(long id) {
		
		return catagoryDao.delete(id);
	}

	@Override
	public List<Catagory> getAll() {
	
		return catagoryDao.getAll();
	}

	@Override
	public Catagory getById(long id) {
		
		return catagoryDao.getById(id);
	}

}
