package ru.phonebook.service;

import ru.phonebook.model.Contact;

public interface ContactService {

    Contact findByPhoneNumber(String phoneNumber);
}
