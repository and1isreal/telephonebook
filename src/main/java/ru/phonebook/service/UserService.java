package ru.phonebook.service;

import ru.phonebook.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAllUsers();

    Optional<User> findUserById(int id);

    User addUser(User user);
}
