package guru.springframework.my_sfg_brewery.web.service;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerByID(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .customerName("Jane Doe")
                .build();
    }
}
