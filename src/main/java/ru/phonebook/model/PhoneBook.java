//package ru.phonebook.model;
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "phone_book")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
//        property  = "id",
//        scope     = Integer.class)
//public class PhoneBook {
//
//    public PhoneBook() {
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "USER_ID")
//    private User user;
//
//    @OneToMany(mappedBy = "phoneBook")
//    private List<Contact> contacts;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public List<Contact> getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
//
//    @Override
//    public String toString() {
//        return "PhoneBook{" +
//                "id=" + id +
//                ", user=" + user.getId() +
////                ", contacts=" + contacts +
//                '}';
//    }
//}
