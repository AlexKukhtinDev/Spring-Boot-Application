package com.akukhtin.springbootapplication.dto;

import com.akukhtin.springbootapplication.model.User;

public class UserDtoUtil {
    public static User createUserFromDto(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        return user;
    }
}
