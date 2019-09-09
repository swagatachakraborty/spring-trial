package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HybernetCostomerRepository;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private HybernetCostomerRepository hybernetCostomerRepository;

    public CustomerServiceImpl() {
    }

    @Override
    public List<Customer> findAll(){
        return hybernetCostomerRepository.findAll();
    }

    @Autowired
    public void setHybernetCostomerRepository(HybernetCostomerRepository hybernetCostomerRepository) {
        this.hybernetCostomerRepository = hybernetCostomerRepository;
    }
}
