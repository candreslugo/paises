package com.example.paises.repositories;

import com.example.paises.models.CountryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CountryRepositories extends CrudRepository<CountryModel,Long> {

    public abstract ArrayList<CountryModel> findByCountry(String country);
    public abstract ArrayList<CountryModel> findByDepartment(String department);
    public abstract ArrayList<CountryModel> findByCities(String cities);

}
