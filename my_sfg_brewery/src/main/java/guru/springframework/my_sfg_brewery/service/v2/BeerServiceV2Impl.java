package guru.springframework.my_sfg_brewery.service.v2;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;
import guru.springframework.my_sfg_brewery.web.model.v2.BeerDTOV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2{
    @Override
    public BeerDTOV2 getBeerByID(UUID beerId) {
        return null;
    }

    @Override
    public BeerDTOV2 saveBeer(BeerDTOV2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
