package com.tub.ise.controller;

import com.tub.ise.model.dto.CitiesRequest;
import com.tub.ise.model.dto.CitiesResponse;
import com.tub.ise.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/cities")
@RestController
public class CitiesController {
    @Autowired
    private CityService cityService;

    @PostMapping
    public List<CitiesResponse> getCitiesByCountryId(@RequestBody CitiesRequest request){
        return cityService.findAll(request.getId());
    }


    @RequestMapping(method=RequestMethod.GET, path = "/healthCheck")
    public String healthCheck(){
        return "This is up and running !";
    }

}
