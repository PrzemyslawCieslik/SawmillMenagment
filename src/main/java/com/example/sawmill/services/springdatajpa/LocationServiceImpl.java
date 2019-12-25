package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Location;
import com.example.sawmill.repositories.LocationRepository;
import com.example.sawmill.services.LocationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location findByCity(String city) {
        return locationRepository.findByCity(city);
    }

    @Override
    public Location findByPostcode(String postcode) {
        return locationRepository.findByPostcode(postcode);
    }

    @Override
    public Location findByStreet(String street) {
        return locationRepository.findByStreet(street);
    }

    @Override
    public List<Location> findAllByCity(String city) {
        return locationRepository.findAllByCity(city);
    }

    @Override
    public List<Location> findAllByPostcode(String postcode) {
        return locationRepository.findAllByPostcode(postcode);
    }

    @Override
    public List<Location> findAllByStreet(String street) {
        return locationRepository.findAllByStreet(street);
    }

    @Override
    public Set<Location> findAll() {
        Set<Location> locations = new HashSet<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }

    @Override
    public Location findById(Long aLong) {
        return locationRepository.findById(aLong).orElse(null);
    }

    @Override
    public Location save(Location object) {
        return locationRepository.save(object);
    }

    @Override
    public void delete(Location object) {
        locationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        locationRepository.deleteById(aLong);
    }
}
