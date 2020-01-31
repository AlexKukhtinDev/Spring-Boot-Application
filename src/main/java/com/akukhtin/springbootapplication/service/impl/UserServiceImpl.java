package com.akukhtin.springbootapplication.service.impl;

import com.akukhtin.springbootapplication.model.User;
import com.akukhtin.springbootapplication.repository.UserRepository;
import com.akukhtin.springbootapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
