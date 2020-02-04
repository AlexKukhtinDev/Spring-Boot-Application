package com.akukhtin.springbootapplication.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    @Column(name = "user_id")
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
    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
    private Set<Role> roles =new HashSet<Role>();

    public User(String name, String surname, String password, Country country, String email) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.country = country;
        this.email = email;
    }

    public User(String name, String surname, String password, String confirmPassword,
                Country country, String email, Set<Role> roles) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.country = country;
        this.email = email;
        this.roles = roles;
    }

    public Set<String> getRolesString() {
        Set<String> list = new HashSet<>();
        for (Role role : roles) {
            list.add(role.getRoleName());
        }
        return list;
    }
}
