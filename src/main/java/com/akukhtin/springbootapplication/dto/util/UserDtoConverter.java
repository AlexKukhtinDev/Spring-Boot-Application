package com.akukhtin.springbootapplication.dto.util;

import com.akukhtin.springbootapplication.dto.UserDto;
import com.akukhtin.springbootapplication.model.User;

public class UserDtoConverter {
    public static User createUserFromDto(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setPassword(userDto.getPassword());
        user.setCountry(userDto.getCountry());
        return user;
    }
}
