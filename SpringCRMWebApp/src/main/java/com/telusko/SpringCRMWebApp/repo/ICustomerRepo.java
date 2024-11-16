package com.telusko.SpringCRMWebApp.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.SpringCRMWebApp.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
