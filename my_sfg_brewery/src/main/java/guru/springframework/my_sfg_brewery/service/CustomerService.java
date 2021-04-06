package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerByID(UUID id);

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void deleteCustomer(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);
}
