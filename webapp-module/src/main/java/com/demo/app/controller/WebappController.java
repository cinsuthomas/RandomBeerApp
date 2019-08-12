package com.demo.app.controller;

import com.demo.app.dto.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@RequestMapping("/beer-app")
public class WebappController {

    @Value("${beerService.url}")
    private String BEER_SERVICE_URL ;

    @GetMapping("/home")
    public ModelAndView viewBeerHome(Model model){

        log.info ("Visited Home Page");
        return viewRandomBeer(0,model);
    }

    @PostMapping("/randomBeer")
    public ModelAndView viewRandomBeer(@RequestParam(value = "beerId") Integer previousBeerId,
                                       Model model){

        log.info ("Fetching random beer. Previous beer id was " + previousBeerId);
        String uri = BEER_SERVICE_URL + "/randomBeer?previousBeerId=" + previousBeerId;
        RestTemplate restTemplate = new RestTemplate();

        BeerDTO beerRecord = restTemplate.getForObject (uri,BeerDTO.class);
        model.addAttribute ("beerDTO",beerRecord);

        log.info ("New random beer id fetched is " + beerRecord.getId () + " and name is " + beerRecord.getName ());
        return new ModelAndView ("viewBeer");
    }


    @PostMapping("/search")
    public ModelAndView viewBeerData(@RequestParam(value = "beerName") String beerName,
                                     Model model){

        String message = null;
        log.info ("Searching for beer " + beerName);
        String uri = BEER_SERVICE_URL + "/beer/" + beerName;
        RestTemplate restTemplate = new RestTemplate();
        BeerDTO beerRecord = beerName != "" ? restTemplate.getForObject (uri,BeerDTO.class) : null;

        if (beerRecord == null) {

            log.info ("Beer {} not in database ",beerName);
            message = "Sorry, result not found!! We have fetched another one for you.";
            viewRandomBeer(0,model);
            model.addAttribute ("message",message);

        } else {

            log.info ("Beer {} found in database ",beerName);
            model.addAttribute ("beerDTO", beerRecord);
        }

        return new ModelAndView ("viewBeer");
    }
}
