package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    void saveUser(User user);

    void updateUser(User updateUser);

    void removeUserById(int id);
}
