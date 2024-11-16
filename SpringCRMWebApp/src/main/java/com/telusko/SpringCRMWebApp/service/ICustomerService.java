package com.telusko.SpringCRMWebApp.service;

import java.util.List;

import com.telusko.SpringCRMWebApp.model.Customer;

public interface ICustomerService {

	public List<Customer> getCustomerInfo();
	public void registerCustomer(Customer customer);
	public Customer fetchCxById(Integer id);
	public void deleteCxRecord(Integer id);
}
