package com.sahil.SpringSecurityAssignment.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    MyAuthenticationProvider myAuthenticationProvider;

    @Autowired
    MyUserDetailsService userDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
//        http.formLogin();

//        http.authorizeRequests()
//                .antMatchers("/users")
//                        .authenticated()
//                            .anyRequest().denyAll();

        //all request needs  to be authenticated
//        http.authorizeRequests().anyRequest().authenticated();
        http
                .authorizeRequests()
                .antMatchers("/users").hasAnyRole("USER","ADMIN")
                .antMatchers("/hello").permitAll()
                .antMatchers("/bye").hasRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable();

    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//
//        //PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//        UserDetails userDetails = User.withUsername("test")
//                .password(passwordEncoder().encode("test"))
//                .roles("admin_role")
//                .build();
//
//        userDetailsManager.createUser(userDetails);
//
//        auth.userDetailsService(userDetailsManager).passwordEncoder(passwordEncoder());
//
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      //  auth.authenticationProvider(myAuthenticationProvider);
        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
