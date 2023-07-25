package com.cglia.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.manytomany.model.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
