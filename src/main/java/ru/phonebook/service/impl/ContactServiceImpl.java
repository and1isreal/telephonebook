package ru.phonebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.phonebook.model.Contact;
import ru.phonebook.repository.ContactRepository;
import ru.phonebook.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        return contactRepository.findContactByPhoneNumber(phoneNumber);
    }
}
