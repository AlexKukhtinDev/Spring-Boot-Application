package com.akukhtin.springbootapplication.service;

import com.akukhtin.springbootapplication.dto.UserDto;
import com.akukhtin.springbootapplication.model.User;
import java.util.Optional;

public interface UserService {
    User update(Long id, UserDto user);

    void delete(User user);

    User create(User user);

    Optional<User> getUserById(Long userId);
}
