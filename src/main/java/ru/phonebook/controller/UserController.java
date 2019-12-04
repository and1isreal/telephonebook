package ru.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.phonebook.model.Contact;
import ru.phonebook.model.User;
import ru.phonebook.service.ContactService;
import ru.phonebook.service.UserService;
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

    @GetMapping("/users/firstName/{firstName}")
    public Object getUserByFirstName(@PathVariable("firstName") String firstName) {
        User user = userService.findUserByFirstName(firstName);
        if (user != null) return user;
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/users",
                 consumes = "application/json")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable("id") int userId) {
        userService.deleteUserById(userId);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User newUser, @PathVariable("id") int userId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            user.get().setFirstName(newUser.getFirstName());
            user.get().setLastName(newUser.getLastName());
            userService.addUser(user.get());
        }
    }

    @GetMapping
    @RequestMapping("users/{userId}")
    public Object userById(@PathVariable("userId") int userId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) return user;
        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/users/{userId}/contacts", method = RequestMethod.GET)
    public Object contactById(@PathVariable("userId") int userId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            return contactService.findAllContactsByUserId(user.get().getId());
        }
        return new ResponseEntity<Contact>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/users/{userId}/contacts/phoneNumber/{phoneNumber}", method = RequestMethod.GET)
    public Object getContactByPhoneNumber(@PathVariable("userId") int userId,
                                          @PathVariable(value = "phoneNumber") String phoneNumber) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            Contact contact = contactService.findContactByPhoneNumber(phoneNumber);
            if (contact != null) return contact;
        }
        return new ResponseEntity<Contact>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @RequestMapping("/users/{userId}/contacts/{contactId}")
    public Object contactById(@PathVariable("userId") int userId, @PathVariable("contactId") int contactId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            Contact contact = contactService.findByIdAndUserId(contactId, userId);
            if (contact != null) return contact;
        }
        return new ResponseEntity<Contact>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/users/{userId}/contacts/{contactId}")
    public ResponseEntity<Contact> deleteContactById(@PathVariable("userId") int userId,
                                                     @PathVariable("contactId") int contactId) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            Contact contact = contactService.findByIdAndUserId(contactId, userId);
            if (contact != null) {
                contactService.deleteContactById(contactId);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/users/{userId}/contacts/{contactId}")
    public ResponseEntity<Contact> updateContact(@PathVariable("userId") int userId,
                                                 @PathVariable("contactId") int contactId,
                                                 @RequestBody Contact newContact) {
        Optional<User> user = userService.findUserById(userId);
        if (user.isPresent()) {
            Contact contact = contactService.findByIdAndUserId(contactId, userId);
            if (contact != null) {
                contact.setFirstName(newContact.getFirstName());
                contact.setLastName(newContact.getLastName());
                contact.setPhoneNumber(newContact.getPhoneNumber());
                contactService.addContact(contact);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }




}
