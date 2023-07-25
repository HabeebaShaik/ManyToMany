package com.cglia.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.manytomany.model.Role;
import com.cglia.manytomany.repository.RoleRepository;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }
}
