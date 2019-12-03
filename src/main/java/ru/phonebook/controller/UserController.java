package ru.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.phonebook.model.Contact;
import ru.phonebook.model.User;
import ru.phonebook.service.ContactService;
import ru.phonebook.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/phonebook")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContactService contactService;

    @GetMapping("/users")
    public List<User> userList() {
        return userService.findAllUsers();
    }

    @PostMapping(value = "/users",
                 consumes = "application/json")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    @RequestMapping("users/{userId}")
    public Object userById(@PathVariable("userId") int userId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) return user;
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @RequestMapping("/users/{userId}/contacts")
    public Object contactById(@PathVariable("userId") int userId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            return contactService.findAllContactsByUserId(user.get().getId());
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
