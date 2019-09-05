package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HybernetCostomerRepositoryImpl implements HybernetCostomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("swagata");
        customer.setLastName("chakraborty");
        customers.add(customer);
        return customers;
    }
}

