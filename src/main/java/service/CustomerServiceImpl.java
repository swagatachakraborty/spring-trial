package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HybernetCostomerRepository;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private HybernetCostomerRepository hybernetCostomerRepository;

    @Autowired
    public CustomerServiceImpl(HybernetCostomerRepository hybernetCostomerRepository) {
        this.hybernetCostomerRepository = hybernetCostomerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return hybernetCostomerRepository.findAll();
    }

}
