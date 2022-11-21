package ru.spiridonov.PP312Boot.dao;

import ru.spiridonov.PP312Boot.model.User;


import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
