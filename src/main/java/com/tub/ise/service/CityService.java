package com.tub.ise.service;

import com.tub.ise.model.dto.CitiesResponse;

import java.util.List;

public interface CityService {


    List<CitiesResponse> findAll(int id);

}
