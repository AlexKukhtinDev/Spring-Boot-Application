package com.akukhtin.springbootapplication.repository;

import com.akukhtin.springbootapplication.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User>findAllById(Long id);
}
