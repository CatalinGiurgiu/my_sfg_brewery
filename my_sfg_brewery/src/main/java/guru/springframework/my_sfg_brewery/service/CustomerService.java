package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    public CustomerDTO getCustomerByID(UUID id);
}
