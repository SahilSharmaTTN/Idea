package com.sahil.SpringSecurityAssignment.repository;


import com.sahil.SpringSecurityAssignment.enitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByUserName(String username);

}
