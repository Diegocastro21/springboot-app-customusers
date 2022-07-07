package com.castro.cu.service;

import com.castro.cu.entity.User;
import com.castro.cu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserRepository repository;

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User createUser(User user)throws Exception {
        if (checkPasswordValid(user) && checkUsernameAvailable(user)) {
            user = repository.save(user);
        }
        return user;
    }

    private boolean checkUsernameAvailable(User user)throws Exception{
        Optional<User> userFound = repository.findByUsername(user.getUsername());
        if (userFound.isPresent()) {
            throw new Exception("Username No disponible");
        }
        return true;
    }

    private boolean checkPasswordValid(User user)throws Exception{
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new Exception("Password y Confirm password no son iguales");
        }
        return true;
    }
}
