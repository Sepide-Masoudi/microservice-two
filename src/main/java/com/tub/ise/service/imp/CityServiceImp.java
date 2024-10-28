package com.tub.ise.service.imp;

import com.tub.ise.model.dto.CitiesResponse;
import com.tub.ise.model.entity.Cities;
import com.tub.ise.service.CityService;
import com.tub.ise.service.repository.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImp implements CityService {
    @Autowired
    private CitiesRepository countriesRepository;
    @Override
    public List<CitiesResponse> findAll(int id) {

        List<Cities> citiesList = countriesRepository.findAll(id);
        List<CitiesResponse> citiesResponseList = new ArrayList<>();
        for (int i = 0; i < citiesList.size(); i++) {
            citiesResponseList.add(CitiesResponse.mapper(citiesList.get(i)));
        }
            return citiesResponseList;
    }
}
