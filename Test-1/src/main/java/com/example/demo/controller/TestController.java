package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

@Controller
public class TestController {
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping("/save")
	@ResponseBody
	public String name() {
		
		Product id=repo.save(new Product("test", 66.6));
		return "Product is with id : "+id.getId();
		
	}
	
	@RequestMapping("/saveall")
	@ResponseBody
	public String name2() {
		
		repo.save(new Product("test", 66.6));
		repo.save(new Product("test2", 66.6));
		repo.save(new Product("test3", 66.6));
		repo.save(new Product("test4", 66.6));
		repo.save(new Product("test5", 66.6));
		return " All Products saved ";
		
	}
	
	@RequestMapping("/getone/{id}")
	@ResponseBody
	public String name3(@PathVariable Integer id) {
		
		Optional<Product> p=repo.findById(id);
		if (p.isPresent()) {
			return "Product is : "+p.toString();
		} else {
 
			return "Product is not exist with id :"+id;
		}
		
	}
	
	@RequestMapping("/get/all")
	@ResponseBody
	public String name4() {
		
        List<Product> p=repo.findAll();
 
			return "Product is not exist with id :"+p.toString();
		
	}
	

	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String name5(@PathVariable Integer id) {
		
        	Optional<Product> p=repo.findById(id);
    		if (p.isPresent()) {
    			repo.deleteById(id);
    			return "Product is deleted with id: "+id;
    		} else {
     
    			return "Product is not exist with id :"+id;
    		}
		
		
	}
	
	@GetMapping("/getpage")
	public String get()
	{
		return "index";
	}

}
