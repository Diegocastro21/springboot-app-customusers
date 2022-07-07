package com.castro.cu.repository;

import com.castro.cu.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    public Optional<User> findByUsername(String username);
}
