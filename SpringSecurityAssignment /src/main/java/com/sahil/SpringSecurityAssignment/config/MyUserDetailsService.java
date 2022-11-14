package com.sahil.SpringSecurityAssignment.config;

import com.sahil.SpringSecurityAssignment.enitites.User;
import com.sahil.SpringSecurityAssignment.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user= userRepository.findUserByUserName(username);


            if(user == null){
                throw new UsernameNotFoundException("User not found : " + username);
            }

            logger.info(user.toString());

            return new MyUserDetail(user);
        }


}
