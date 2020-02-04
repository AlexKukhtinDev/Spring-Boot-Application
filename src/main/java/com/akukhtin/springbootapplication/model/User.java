package com.akukhtin.springbootapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "password")
    private String password;
    private String confirmPassword;
    @Column(name = "country")
    private Country country;
    @Column(name = "email")
    private String email;

    public User(String name, String surname, String password, Country country, String email) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.country = country;
        this.email = email;
    }
}
