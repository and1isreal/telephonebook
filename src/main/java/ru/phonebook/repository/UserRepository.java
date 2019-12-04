package ru.phonebook.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.phonebook.model.User;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
//    @Query("select u from user u where u.firstName like ''%s%''")
//    List<User> findByFirstNameLike(String name);

    List<User> findByFirstNameContaining(String name);
}
