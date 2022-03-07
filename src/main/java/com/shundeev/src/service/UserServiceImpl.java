package com.shundeev.src.service;

import com.shundeev.src.dao.UserDAO;
import com.shundeev.src.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final PasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, PasswordEncoder encoder) {
        this.userDAO = userDAO;
        this.encoder = encoder;
    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userDAO.add(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public void edit(User user) {
        String oldPassword = getUserById(user.getId()).getPassword();
        String newPassword = user.getPassword();
        if (!oldPassword.equals(newPassword)) {
            user.setPassword(encoder.encode(user.getPassword()));
        }
        userDAO.edit(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public User findUserByEmail(String email) {
        return userDAO.findUserByEmail(email);
    }

}
