package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerByID(UUID beerId);

    BeerDTO saveBeer(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteBeer(UUID beerId);
}
