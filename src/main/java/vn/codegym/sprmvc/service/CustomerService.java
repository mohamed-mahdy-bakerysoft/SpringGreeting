package vn.codegym.sprmvc.service;

import vn.codegym.sprmvc.model.Customer;

import java.util.Collections;
import java.util.List;

public class CustomerService implements ICustomerService {
    private List<Customer> customers;
    @Override
    public List<Customer> findAllCustomers() {
        return Collections.emptyList();
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
