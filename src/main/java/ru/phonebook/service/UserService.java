package ru.phonebook.service;

import ru.phonebook.model.User;

import java.util.List;

public interface UserService {

    List<User> findUserByName(String name);

}
