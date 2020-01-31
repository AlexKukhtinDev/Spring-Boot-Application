package com.akukhtin.springbootapplication.service;

import com.akukhtin.springbootapplication.model.User;

public interface UserService {
    User update(User user);

    void delete(User user);

    User create(User user);
}
