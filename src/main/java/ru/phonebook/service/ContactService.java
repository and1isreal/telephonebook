package ru.phonebook.service;

import ru.phonebook.model.Contact;
import ru.phonebook.model.User;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    List<Contact> findAllContacts();

    Optional<Contact> findContactById(int id);

    List<Contact> findAllContactsByUserId(int userId);
}
