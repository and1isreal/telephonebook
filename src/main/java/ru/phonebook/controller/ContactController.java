//package ru.phonebook.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.phonebook.model.Contact;
//import ru.phonebook.service.ContactService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/contact")
//public class ContactController {
//
//    @Autowired
//    private ContactService contactService;
//
//    @GetMapping
//    public List<Contact> getContacts() {
//        return contactService.findAllContacts();
//    }
//
//    @GetMapping("/{id}")
//    public Object contactById(@PathVariable("id") int contactId) {
//        Optional<Contact> contact = contactService.findContactById(contactId);
//        if (contact.isPresent()) return contact;
//        return new ResponseEntity(HttpStatus.NOT_FOUND);
//    }
//
//}
