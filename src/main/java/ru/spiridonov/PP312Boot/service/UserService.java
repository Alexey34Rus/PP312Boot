package ru.spiridonov.PP312Boot.service;

import ru.spiridonov.PP312Boot.model.User;


import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);

}
