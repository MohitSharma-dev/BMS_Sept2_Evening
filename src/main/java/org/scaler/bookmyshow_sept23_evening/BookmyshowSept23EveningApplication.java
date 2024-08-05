package org.scaler.bookmyshow_sept23_evening;

import org.scaler.bookmyshow_sept23_evening.controllers.UserController;
import org.scaler.bookmyshow_sept23_evening.dtos.ResponseStatus;
import org.scaler.bookmyshow_sept23_evening.dtos.SignUpRequestDTO;
import org.scaler.bookmyshow_sept23_evening.dtos.SignUpResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookmyshowSept23EveningApplication implements CommandLineRunner {
    @Autowired
    UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO req = new SignUpRequestDTO();
        req.setEmail("mohit.sharma2@scaler.com");
        req.setPassword("password");
        SignUpResponseDTO responseDTO = userController.signUp(req);
        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("User is signed Up");
        } else {
            System.out.println(responseDTO.getMessage());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(BookmyshowSept23EveningApplication.class, args);
    }

}


// Basic sign up flow
    // email, password
    // proper authentication will be covered in project module 4-5 sessions

// Book ticket

// UserController

// HW :
    // Please ingest the data and test your book Ticket functionality
