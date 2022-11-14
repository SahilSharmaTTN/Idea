package com.sahil.SpringSecurityAssignment.services;

import com.sahil.SpringSecurityAssignment.enitites.Role;
import com.sahil.SpringSecurityAssignment.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
