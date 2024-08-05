package org.scaler.bookmyshow_sept23_evening.services;

import org.scaler.bookmyshow_sept23_evening.models.User;
import org.scaler.bookmyshow_sept23_evening.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User signUp(
            String email,
            String password
    ){
        // 1. check if user already exists
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        // BCryptPasswordEncoder()
        // user is saved in the database
        user = userRepository.save(user);
        return user;
    }
}
