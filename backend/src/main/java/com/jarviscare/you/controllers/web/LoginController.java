package com.jarviscare.you.controllers.web;

import com.jarviscare.you.model.User;
import com.jarviscare.you.services.PasswordManager;
import com.jarviscare.you.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class LoginController {

    private UserServiceImpl userService;

    // Inject the service
    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword();

        if (email == null || password == null ) {
            return new ResponseEntity<>("Missing fields", HttpStatus.BAD_REQUEST);
        }

        User internalUser = userService.getUserByEmail(email);

        if (internalUser != null) {

            if (internalUser.getEmail().equals(email) &&
                    PasswordManager.checkPassword(password, internalUser.getPassword())) {
                return new ResponseEntity<>("Login successful", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }
    }