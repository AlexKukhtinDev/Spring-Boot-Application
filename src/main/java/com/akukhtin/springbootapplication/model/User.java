package com.akukhtin.springbootapplication.model;

public class User {

    private Long id;
    private String name;
    private String surname;
    private char[] password;
    private char[] confirmPassword;
    private Country country;

    public User(String name, String surname, char[] password, Country country) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(char[] confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
