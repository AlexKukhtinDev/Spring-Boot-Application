package com.akukhtin.springbootapplication.service.impl;

import com.akukhtin.springbootapplication.dto.UserDto;
import com.akukhtin.springbootapplication.model.User;
import com.akukhtin.springbootapplication.repository.UserRepository;
import com.akukhtin.springbootapplication.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> update(Long id, UserDto userDto) {
        User newUser = userRepository.findById(id).orElseThrow();
        newUser.setName(userDto.getName());
        newUser.setSurname(userDto.getSurname());
        newUser.setPassword(userDto.getPassword());
        newUser.setCountry(userDto.getCountry());
        return Optional.of(newUser);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public Optional<User> create(User user) {
        User saveUser = userRepository.save(user);
        return Optional.ofNullable(saveUser);
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }
}
