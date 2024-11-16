package com.telusko.SpringCRMWebApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringCRMWebApp.model.Customer;
import com.telusko.SpringCRMWebApp.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	public List<Customer> getCustomerInfo() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
	}

	@Override
	public Customer fetchCxById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Customer> optional = repo.findById(id);
		
		return optional.get();
	}

	@Override
	public void deleteCxRecord(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	
	
}
