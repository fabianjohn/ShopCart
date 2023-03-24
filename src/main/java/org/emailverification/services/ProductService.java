package org.emailverification.services;

import java.util.Date;
import java.util.List;

import org.emailverification.entity.Product;
import org.emailverification.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public List<Product> listAll(){
		return productRepo.findAll();
	}
	
	public void save(Product newproduct){
		
	    productRepo.save(newproduct);
	    }

	

	public List<Product> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product setCode(Integer code) {
		// TODO Auto-generated method stub
		return productRepo.save(code);
	}

	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	

	

}
