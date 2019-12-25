package com.example.sawmill.repositories;

import com.example.sawmill.model.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepository extends CrudRepository <Company, Long> {

    Company findByCompanyName (String companyName);

    List<Company> findAllByCompanyName (String companyName);
}
