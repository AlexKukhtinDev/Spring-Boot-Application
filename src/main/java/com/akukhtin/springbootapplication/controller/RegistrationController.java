package com.akukhtin.springbootapplication.controller;

import com.akukhtin.springbootapplication.dto.UserDto;
import com.akukhtin.springbootapplication.dto.util.UserDtoConverter;
import com.akukhtin.springbootapplication.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @PostMapping("/add")
    public void add(@Valid @RequestBody UserDto userDto) {
        userService.create(UserDtoConverter.createUserFromDto(userDto));
    }
}
