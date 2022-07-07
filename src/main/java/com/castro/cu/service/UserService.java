package com.castro.cu.service;

import com.castro.cu.entity.User;

import javax.validation.Valid;

public interface UserService {

    public Iterable<User> getAllUsers();

    public User createUser( User user)throws Exception;
}
