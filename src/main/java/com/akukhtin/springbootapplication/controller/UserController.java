package com.akukhtin.springbootapplication.controller;

import com.akukhtin.springbootapplication.dto.UserDto;
import com.akukhtin.springbootapplication.dto.util.UserDtoConverter;
import com.akukhtin.springbootapplication.exception.UserNotFoundException;
import com.akukhtin.springbootapplication.model.User;
import com.akukhtin.springbootapplication.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void add(@Valid @RequestBody UserDto userDto) {
        userService.create(UserDtoConverter.createUserFromDto(userDto));
    }

    @GetMapping("/{userId}")
    public User getById(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId).orElseThrow(() ->
                new UserNotFoundException("User with Id " + userId + " not found"));
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable() Long userId) {
        userService.delete(getById(userId));
    }

    @PutMapping("/{userId}")
    public User update(@PathVariable("userId") Long userId, UserDto userDto) {
        return userService.update(userId, userDto);
    }
}
