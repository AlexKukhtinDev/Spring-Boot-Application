package com.akukhtin.springbootapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "userfromcanada")
public class UserFromCanada extends User {
    @Column
    private String provinceName;
    @Column
    private String currentCity;
}
