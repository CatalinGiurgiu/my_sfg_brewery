package guru.springframework.my_sfg_brewery.web.controller;

import guru.springframework.my_sfg_brewery.web.model.CustomerDTO;
import guru.springframework.my_sfg_brewery.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDTO customerDTO){
        CustomerDTO savedDTO = customerService.saveCustomer(customerDTO);
        HttpHeaders header = new HttpHeaders();
        header.add("Location", "api/v1/customer/" + savedDTO.getId().toString());

        return new ResponseEntity(header, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handle(@RequestBody CustomerDTO customerDTO, @PathVariable("customerId") UUID customerId){
        customerService.updateCustomer(customerId, customerDTO);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer (@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
    }
}
