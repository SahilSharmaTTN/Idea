package com.sahil.SpringSecurityAssignment.services;

import com.sahil.SpringSecurityAssignment.enitites.User;


public interface UserService {

    public Iterable<User> getAllUsers();
    public User createUser(User user);
}
