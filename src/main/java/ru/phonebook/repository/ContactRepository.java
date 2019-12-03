package ru.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.phonebook.model.Contact;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    List<Contact> findAllByUserId(int id);
}
