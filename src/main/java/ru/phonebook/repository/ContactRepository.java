package ru.phonebook.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.phonebook.model.Contact;

public interface ContactRepository extends PagingAndSortingRepository<Contact, Integer> {

    Contact findContactByPhoneNumber(String phoneNumber);
}
