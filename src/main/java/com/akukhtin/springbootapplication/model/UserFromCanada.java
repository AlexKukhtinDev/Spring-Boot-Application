package com.akukhtin.springbootapplication.model;

public class UserFromCanada extends User {
    private String provinceName;
    private String currentCity;

    public UserFromCanada(String name, String surname,
                          char[] password, Country country,
                          String provinceName,String currentCity) {
        super(name, surname, password, country);
        this.provinceName = provinceName;
        this.currentCity = currentCity;
    }
}
