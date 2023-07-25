package com.cglia.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.manytomany.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
