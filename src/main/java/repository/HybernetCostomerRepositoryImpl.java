package repository;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("HybernetCostomerRepository")
public class HybernetCostomerRepositoryImpl implements HybernetCostomerRepository {

    private Customer customer;

    @Autowired
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

