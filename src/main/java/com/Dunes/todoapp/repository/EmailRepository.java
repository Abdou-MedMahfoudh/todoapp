package com.Dunes.todoapp.repository;

import com.Dunes.todoapp.Models.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email,String> {
}
