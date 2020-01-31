package com.akukhtin.springbootapplication.dto;

import com.akukhtin.springbootapplication.model.Country;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @NotNull
    private String surname;
    @NotEmpty
    @NotNull
    private char[] password;
    @NotEmpty
    @NotNull
    private Country country;

    public UserDto(@NotEmpty @NotNull String name, @NotEmpty @NotNull String surname,
                   @NotEmpty @NotNull char[] password, @NotEmpty @NotNull Country country) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.country = country;
    }
}
