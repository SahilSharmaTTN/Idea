package com.sahil.SpringSecurityAssignment.controller;


import com.sahil.SpringSecurityAssignment.enitites.Role;
import com.sahil.SpringSecurityAssignment.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roles")
    public Iterable<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
}
