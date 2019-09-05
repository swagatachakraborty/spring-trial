package service;

import model.Customer;
import repository.HybernetCostomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private HybernetCostomerRepository hybernetCostomerRepository;

    public CustomerServiceImpl() {
    }

    public void setHybernetCostomerRepository(HybernetCostomerRepository hybernetCostomerRepository) {
        this.hybernetCostomerRepository = hybernetCostomerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return hybernetCostomerRepository.findAll();
    }

}
