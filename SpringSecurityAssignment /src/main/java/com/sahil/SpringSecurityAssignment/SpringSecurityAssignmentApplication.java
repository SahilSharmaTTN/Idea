package com.sahil.SpringSecurityAssignment;

import com.sahil.SpringSecurityAssignment.enitites.Role;
import com.sahil.SpringSecurityAssignment.enitites.User;
import com.sahil.SpringSecurityAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringSecurityAssignmentApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User user1 =  new User();

		user1.setUserName("test");
		user1.setEmail("test@gmail.com");
		user1.setPassword(this.passwordEncoder.encode("test"));
		user1.setRole("ROLE_USER");

		User user2 =  new User();

		user2.setUserName("Sahil");
		user2.setEmail("S@gmail.com");
		user2.setPassword(this.passwordEncoder.encode("test"));
		user2.setRole("ROLE_ADMIN");

		userRepository.save(user1);
		userRepository.save(user2);

	}
}
