package com.bookstore.springbootbookstore.service;

import com.bookstore.springbootbookstore.entity.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
