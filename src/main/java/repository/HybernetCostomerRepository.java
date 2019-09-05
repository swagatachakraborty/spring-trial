package repository;

import model.Customer;

import java.util.List;

public interface HybernetCostomerRepository {
    List<Customer> findAll();
}
