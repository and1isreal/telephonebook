//package ru.phonebook.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ru.phonebook.model.PhoneBook;
//import ru.phonebook.repository.PhoneBookRepository;
//import ru.phonebook.service.PhoneBookService;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PhoneBookServiceImpl implements PhoneBookService {
//
//    @Autowired
//    private PhoneBookRepository phoneBookRepository;
//
//    @Override
//    public List<PhoneBook> findAllPhoneBooks() {
//        return phoneBookRepository.findAll();
//    }
//
//    @Override
//    public Optional<PhoneBook> findPhoneBookById(int id) {
//        return phoneBookRepository.findById(id);
//    }
//}
