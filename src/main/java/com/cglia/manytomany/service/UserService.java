package com.cglia.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.manytomany.model.Users;
import com.cglia.manytomany.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void updateUser(Users user) {
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
