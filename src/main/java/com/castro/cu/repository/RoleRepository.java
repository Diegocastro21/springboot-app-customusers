package com.castro.cu.repository;

import com.castro.cu.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    public Role findByName(String role);
}
