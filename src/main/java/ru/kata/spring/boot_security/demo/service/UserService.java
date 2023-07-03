package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
public interface UserService extends UserDetailsService {
    List<User> getAllUser();
    void saveUser(User user);
    void deleteUser(Long id);
    User findById(Long id);
    void updateUser(User user);
    User findByEmail(String email);
}
