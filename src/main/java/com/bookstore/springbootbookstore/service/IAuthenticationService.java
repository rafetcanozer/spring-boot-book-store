package com.bookstore.springbootbookstore.service;

import com.bookstore.springbootbookstore.entity.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
