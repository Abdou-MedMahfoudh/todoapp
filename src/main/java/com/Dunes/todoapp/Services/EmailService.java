package com.Dunes.todoapp.Services;

import com.Dunes.todoapp.Models.Email;
import com.Dunes.todoapp.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository ;

    public void SaveEmail (String emailaddress){
        Email email1 = new Email();
        email1.setEmailaddress(emailaddress);
        emailRepository.save(email1);
    }


}
