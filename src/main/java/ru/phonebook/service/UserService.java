package ru.phonebook.service;

import ru.phonebook.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAllUsers();

    Optional<User> findUserById(int id);

    User addUser(User user);

    void deleteUserById(int id);

    User findUserByFirstName(String firstName);

//    void deleteUser(User user);

//    void updateUserById(int id);
}
