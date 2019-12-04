package ru.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.phonebook.model.Contact;
import ru.phonebook.model.User;
import ru.phonebook.service.ContactService;
import ru.phonebook.service.UserService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContactService contactService;

    @GetMapping("/users/")
    public List<User> getUserByName(@RequestParam(value = "name", required = false) String name) {
        return userService.findUserByName(name);
    }

    @GetMapping("/contacts/")
    public Contact getContactByTelephoneNumber(@RequestParam(value = "number", required = false) String number) {
        return contactService.findByPhoneNumber(number);
    }

}
