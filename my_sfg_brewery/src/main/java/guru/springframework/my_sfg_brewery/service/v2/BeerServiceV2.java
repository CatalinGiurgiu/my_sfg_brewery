package guru.springframework.my_sfg_brewery.service.v2;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;
import guru.springframework.my_sfg_brewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDTOV2 getBeerByID(UUID beerId);

    BeerDTOV2 saveBeer(BeerDTOV2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

    void deleteBeer(UUID beerId);
}
