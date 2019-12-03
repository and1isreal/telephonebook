package ru.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.phonebook.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
