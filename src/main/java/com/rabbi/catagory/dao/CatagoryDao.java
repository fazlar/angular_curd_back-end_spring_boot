package com.rabbi.catagory.dao;

import java.util.List;

import com.rabbi.model.Catagory;



public interface CatagoryDao {

	public Catagory saveCatagory(Catagory catagory);
    public boolean update(Catagory catagory);
    public boolean delete(long id);
    public List<Catagory> getAll();
    public Catagory getById(long id);

}
