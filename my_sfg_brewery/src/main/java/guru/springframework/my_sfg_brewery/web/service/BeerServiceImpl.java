package guru.springframework.my_sfg_brewery.web.service;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDTO getBeerByID(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Beer")
                .beerStyle("Pale Ale")
                .build();
    }
}
