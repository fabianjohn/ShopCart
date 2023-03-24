package org.emailverification.services;

import java.util.List;

import org.emailverification.entity.Category;
import org.emailverification.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository catRepo;
	
	public List<Category>listAll(){
		return catRepo.findAll();
	}
	
	public void save(Category cat){
	    catRepo.save(cat);
	    }
	
	
	public List<Category> findCategory(String catName) {
		// TODO Auto-generated method stub
		return catRepo.findByCatName(catName);
	}
}
