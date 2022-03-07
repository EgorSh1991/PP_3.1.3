package com.shundeev.src.dao;

import com.shundeev.src.models.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    void edit(User user);

    User getUserById(Long id);

    User findUserByEmail(String email);
}