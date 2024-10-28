package com.tub.ise.service.repository;

import com.tub.ise.model.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitiesRepository extends JpaRepository<Cities,Integer> {
    @Query("select c from Cities c where c.countiesId=?1")
    List<Cities> findAll(int id);
}
