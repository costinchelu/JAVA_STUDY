package ro.ccar.service;

import ro.ccar.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int customerId);

    void deleteCustomer(int customerId);

    List<Customer> searchCustomers(String searchName);
}
