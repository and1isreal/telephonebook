package ru.phonebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.phonebook.model.Contact;
import ru.phonebook.repository.ContactRepository;
import ru.phonebook.service.ContactService;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> findContactById(int id) {
        return contactRepository.findById(id);
    }

    @Override
    public List<Contact> findAllContactsByUserId(int userId) {
        return contactRepository.findAllByUserId(userId);
    }
}
