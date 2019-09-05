package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HybernetCostomerRepositoryImpl implements HybernetCostomerRepository {
    private Customer customer;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customer.setFirstName("swagata");
        customer.setLastName("chakraborty");
        customers.add(customer);
        return customers;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

