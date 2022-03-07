package com.shundeev.src.service;

import com.shundeev.src.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    void edit(User user);

    User getUserById(Long id);

    User findUserByEmail(String email);

}