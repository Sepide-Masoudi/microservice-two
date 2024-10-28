package com.tub.ise.model.dto;

import com.tub.ise.model.entity.Cities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CitiesResponse {

    private String name;


    public static CitiesResponse mapper(Cities countries){
        return new CitiesResponse(countries.getName());
    }
}
