package com.demo.app.controller;

import com.demo.app.dto.BeerDTO;
import com.demo.app.service.BeerDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/beer-service")
public class BeerController {

    @Autowired
    private BeerDataService beerDataService;

    @GetMapping("/randomBeer")
    public BeerDTO getRandomBeer(@RequestParam(value="beerId") Integer beerId){

        return beerDataService.getRandomBeer(beerId);
    }

    @GetMapping("/beer/{beerName}")
    public BeerDTO getBeerData(@PathVariable(value = "beerName") String beerName){

        return beerDataService.fetchBeerDataByName(beerName);
    }
}
