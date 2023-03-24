package org.emailverification.services;

import java.util.List;

import org.emailverification.entity.Customers;
import org.emailverification.repo.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServices {
	
	@Autowired
	CustomersRepository CustRepo;
	
	public List<Customers>listAll(){
		return CustRepo.findAll();
	}
	
	public void save(Customers user){
	    CustRepo.save(user);
	    }
	

}
