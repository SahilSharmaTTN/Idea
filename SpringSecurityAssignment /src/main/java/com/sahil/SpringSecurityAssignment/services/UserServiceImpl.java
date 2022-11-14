package com.sahil.SpringSecurityAssignment.services;

import com.sahil.SpringSecurityAssignment.enitites.User;
import com.sahil.SpringSecurityAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User createUser(User user){
        String pass = user.getPassword();
        user.setPassword(this.bCryptPasswordEncoder.encode(pass));
        return userRepository.save(user);
    }
}
