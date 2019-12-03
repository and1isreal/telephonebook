//package ru.phonebook.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.phonebook.model.PhoneBook;
//import ru.phonebook.service.PhoneBookService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/phonebook")
//public class PhoneBookController {
//
//    @Autowired
//    private PhoneBookService phoneBookService;
//
//    @GetMapping
//    public List<PhoneBook> phoneBookList() {
//        return phoneBookService.findAllPhoneBooks();
//    }
//
//    @GetMapping("/{id}")
//    public Object phoneBookById(@PathVariable("id") int phoneBookId) {
//        Optional<PhoneBook> phoneBook = phoneBookService.findPhoneBookById(phoneBookId);
//        if (phoneBook.isPresent()) return phoneBook;
//        return new ResponseEntity(HttpStatus.NOT_FOUND);
//    }
//}
