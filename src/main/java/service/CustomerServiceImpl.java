package service;

import model.Customer;
import repository.HybernetCostomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private HybernetCostomerRepository hybernetCostomerRepository;

    @Override
    public List<Customer> findAll(){
        return hybernetCostomerRepository.findAll();
    }

    public void setHybernetCostomerRepository(HybernetCostomerRepository hybernetCostomerRepository) {
        this.hybernetCostomerRepository = hybernetCostomerRepository;
    }
}
