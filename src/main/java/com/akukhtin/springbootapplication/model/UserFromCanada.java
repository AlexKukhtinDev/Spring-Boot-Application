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

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }
}
