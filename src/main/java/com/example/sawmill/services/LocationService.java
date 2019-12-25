package com.example.sawmill.services;

import com.example.sawmill.model.Location;

import java.util.List;

public interface LocationService extends CrudService<Location, Long> {

    Location findByCity (String city);

    Location findByPostcode (String postcode);

    Location findByStreet (String street);

    List<Location> findAllByCity (String city);

    List<Location> findAllByPostcode (String postcode);

    List<Location> findAllByStreet (String street);

}
