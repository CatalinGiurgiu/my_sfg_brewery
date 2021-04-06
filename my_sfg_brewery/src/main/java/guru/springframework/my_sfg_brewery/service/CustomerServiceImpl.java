package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerByID(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .customerName("Jane Doe")
                .build();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .customerName("Jane Doe")
                .build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //todo implement method
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        log.debug("Deleting a customer...");
    }
}
