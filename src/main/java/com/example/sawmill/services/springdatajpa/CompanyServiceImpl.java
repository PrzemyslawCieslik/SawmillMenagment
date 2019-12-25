package com.example.sawmill.services.springdatajpa;

import com.example.sawmill.model.Company;
import com.example.sawmill.repositories.CompanyRepository;
import com.example.sawmill.services.CompanyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company findByCompanyName(String companyName) {
        return companyRepository.findByCompanyName(companyName);
    }

    @Override
    public List<Company> findAllByCompanyName(String companyName) {
        return companyRepository.findAllByCompanyName(companyName);
    }

    @Override
    public Set<Company> findAll() {
        Set<Company> companies = new HashSet<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    @Override
    public Company findById(Long aLong) {
        return companyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Company save(Company object) {
        return companyRepository.save(object);
    }

    @Override
    public void delete(Company object) {
        companyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        companyRepository.deleteById(aLong);
    }
}
