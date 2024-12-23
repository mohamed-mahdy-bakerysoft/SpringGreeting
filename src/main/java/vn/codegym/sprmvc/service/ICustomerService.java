package vn.codegym.sprmvc.service;

import vn.codegym.sprmvc.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomers();

    Customer findById(int id);
}
