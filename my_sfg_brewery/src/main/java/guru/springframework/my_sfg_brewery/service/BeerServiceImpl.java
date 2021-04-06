package guru.springframework.my_sfg_brewery.service;

import guru.springframework.my_sfg_brewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDTO getBeerByID(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Beer")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDTO saveBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        //todo update beerdto
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
