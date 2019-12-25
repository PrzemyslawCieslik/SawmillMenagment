package com.example.sawmill.services;

import com.example.sawmill.model.Company;

import java.util.List;

public interface CompanyService extends CrudService<Company, Long> {

    Company findByCompanyName (String companyName);

    List<Company> findAllByCompanyName (String companyName);

}
