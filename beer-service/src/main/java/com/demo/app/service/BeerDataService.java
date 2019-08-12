package com.demo.app.service;

import com.demo.app.dto.BeerDTO;
import com.demo.app.entity.BeerEntity;
import com.demo.app.repository.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Slf4j
@Service
public class BeerDataService {

    @Autowired
    private BeerRepository beerRepository;

    public BeerDTO getRandomBeer(Integer previousBeerId){

        Integer totalBeerCount = Math.toIntExact (beerRepository.count ( ));
        Integer randomBeerId = generateRandomNumber(totalBeerCount,previousBeerId);
        return fetchBeerById(randomBeerId);
    }

    public Integer generateRandomNumber(Integer count,Integer previousBeerId){

        Random random = new Random ();
        Integer randomBeerId;

        do {
            randomBeerId = random.nextInt(count)+1;
            log.info("Total beer count = "+ count + ". Getting random beer id " + randomBeerId + ". Previous beer id = " + previousBeerId);
        } while (previousBeerId == randomBeerId);

        return randomBeerId;
    }

    public BeerDTO fetchBeerById(Integer beerId){

        Optional<BeerEntity> beerEntity = beerRepository.findById (beerId);
        BeerDTO beerDTO = null;

        if(beerEntity.isPresent ()) {
            beerDTO = mapEntityToDTO (beerEntity.get ());
        }

        return beerDTO;
    }

    public BeerDTO fetchBeerByName(String beerName){

        Optional<BeerEntity> beerEntity = beerRepository.findByName(beerName);
        BeerDTO beerDTO = null;

        if(beerEntity.isPresent ()) {
            beerDTO = mapEntityToDTO (beerEntity.get ());
        }

        return beerDTO;
    }

    private BeerDTO mapEntityToDTO(BeerEntity beerEntity){

        return BeerDTO.builder ()
                .id (beerEntity.getId ())
                .name (beerEntity.getName ())
                .description (beerEntity.getDescription ())
                .alcoholPercentage (beerEntity.getAlcoholPercentage ())
                .breweryLocation (beerEntity.getBreweryLocation ())
                .imageLocation (beerEntity.getImageLocation ())
                .build ();
    }
}
