package com.Dunes.todoapp.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Email {
    @Id
    private String emailaddress ;


}
