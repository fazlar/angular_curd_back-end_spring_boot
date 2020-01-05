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

import com.rabbi.catagory.service.CatagoryService;
import com.rabbi.model.Catagory;
import com.rabbi.model.Product;

@RestController
@CrossOrigin(origins = "*")
public class CatagoryController {
	@Autowired
    CatagoryService catagoryService;
	
	@PostMapping("/save-catogary")
	public Catagory saveCatagory(@RequestBody Catagory catagory) {
        System.out.println( catagory.getCatagoryName());
		return catagoryService.saveCatagory(catagory);

	}
	 @GetMapping("/showe-catagory")
	    public List<Catagory> showCatagory(){
	        List <Catagory> catagoryList  =  catagoryService.getAll();
	    	return catagoryList;
	    }
	 
	 @DeleteMapping("delete/{id}")
	 public List<Catagory>deleteCatagory(@PathVariable long id){
		 
		 catagoryService.delete(id);
		 return catagoryService.getAll();
	 }
	 @GetMapping("getcatagory/{id}")
	    public Catagory showProduct(@PathVariable long id){
		 Catagory catagoryList  =  catagoryService.getById(id);
	    	return catagoryList;
	    }
	 
}
