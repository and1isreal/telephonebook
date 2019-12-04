package ru.phonebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.phonebook.model.User;
import ru.phonebook.repository.UserRepository;
import ru.phonebook.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findUserByName(String name) {
        return userRepository.findByFirstNameContaining(name);
    }
}
