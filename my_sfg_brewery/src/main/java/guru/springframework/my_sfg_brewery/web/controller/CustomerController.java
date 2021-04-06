package guru.springframework.my_sfg_brewery.web.controller;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;
import guru.springframework.my_sfg_brewery.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId")UUID id){
        return new ResponseEntity<CustomerDTO>(customerService.getCustomerByID(id), HttpStatus.OK);
    }
}
