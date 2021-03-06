package com.castro.cu.service;

import com.castro.cu.dto.ChangePasswordForm;
import com.castro.cu.entity.User;
import com.castro.cu.exceptions.UsernameOrIdNotFound;

import javax.validation.Valid;

public interface UserService {

    public Iterable<User> getAllUsers();

    public User createUser(User user) throws Exception;

    public User getUserById(Long id) throws Exception;

    public User updateUser(User user) throws Exception;

    public void deleteUser(Long id) throws UsernameOrIdNotFound;

    public User changePassword(ChangePasswordForm form) throws Exception;
}
