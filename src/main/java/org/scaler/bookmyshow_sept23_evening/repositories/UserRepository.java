package org.scaler.bookmyshow_sept23_evening.repositories;

import org.scaler.bookmyshow_sept23_evening.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
// find user by matching the email

// Models
// repos
// Spring data JPA : interface
// Hibernate : ORM

// select * from users where email = "";