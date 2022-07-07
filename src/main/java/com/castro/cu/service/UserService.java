package com.castro.cu.service;

import com.castro.cu.entity.User;

import javax.validation.Valid;

public interface UserService {

    public Iterable<User> getAllUsers();

    public User createUser( User user)throws Exception;

    public User getUserById(Long id)throws Exception;

    public User updateUser(User user) throws Exception;

    public void deleteUser(Long id)throws Exception;

}
