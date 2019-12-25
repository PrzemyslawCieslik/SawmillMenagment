package com.example.sawmill.repositories;

import com.example.sawmill.model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {

    Location findByCity (String city);

    Location findByPostcode (String postcode);

    Location findByStreet (String street);

    List<Location> findAllByCity (String city);

    List<Location> findAllByPostcode (String postcode);

    List<Location> findAllByStreet (String street);

}
