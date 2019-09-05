package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HybernetCostomerRepositoryImpl implements HybernetCostomerRepository {
    private Customer customer;

    public HybernetCostomerRepositoryImpl(Customer customer) {
        this.customer = customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customer.setFirstName("swagata");
        customer.setLastName("chakraborty");
        customers.add(customer);
        return customers;
    }

}

