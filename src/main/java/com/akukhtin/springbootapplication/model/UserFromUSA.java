package com.akukhtin.springbootapplication.model;

import java.util.ArrayList;
import java.util.List;

public class UserFromUSA extends User {

    private List<UserFromUSA> listOfNeighboringStates = new ArrayList<>();

    public UserFromUSA(String name, String surname, char[] password, Country country) {
        super(name, surname, password, country);
    }
}
