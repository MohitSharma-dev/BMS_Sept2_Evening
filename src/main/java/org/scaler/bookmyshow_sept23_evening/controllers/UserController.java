package org.scaler.bookmyshow_sept23_evening.controllers;

import org.scaler.bookmyshow_sept23_evening.dtos.ResponseStatus;
import org.scaler.bookmyshow_sept23_evening.dtos.SignUpRequestDTO;
import org.scaler.bookmyshow_sept23_evening.dtos.SignUpResponseDTO;
import org.scaler.bookmyshow_sept23_evening.models.User;
import org.scaler.bookmyshow_sept23_evening.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDTO signUp(SignUpRequestDTO request){
        SignUpResponseDTO response = new SignUpResponseDTO();

        try {
            User user = userService.signUp(
                    request.getEmail(),
                    request.getPassword()
            );
            response.setUserId(user.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
