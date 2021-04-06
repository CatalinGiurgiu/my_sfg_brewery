package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    public BeerDTO getBeerByID(UUID beerId);
}
