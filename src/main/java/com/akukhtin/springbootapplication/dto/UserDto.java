package com.akukhtin.springbootapplication.dto;

import com.akukhtin.springbootapplication.model.Country;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
    private String name;
    private String surname;
    private char[] password;
    private char[] confirmPassword;
    private Country country;
}
