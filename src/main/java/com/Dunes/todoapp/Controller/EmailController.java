package com.Dunes.todoapp.Controller;

import com.Dunes.todoapp.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping
    public void SaveEmail(@RequestParam String emailAddress) {
        emailService.SaveEmail(emailAddress);
//        System.out.println("posted");


    }

}
