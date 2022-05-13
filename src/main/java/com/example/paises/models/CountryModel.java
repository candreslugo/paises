package com.example.paises.models;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "country")


public class CountryModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String country;
    private String department;
    private String cities;

}
