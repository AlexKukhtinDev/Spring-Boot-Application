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
    public User update(Long id, UserDto userDto) {
        User newUser = userRepository.getOne(id);
        newUser.setName(userDto.getName());
        newUser.setSurname(userDto.getSurname());
        newUser.setPassword(userDto.getPassword());
        newUser.setCountry(userDto.getCountry());
        return newUser;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
