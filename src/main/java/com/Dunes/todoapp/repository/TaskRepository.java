package com.Dunes.todoapp.repository;

import com.Dunes.todoapp.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository< Task  , Long > {
}
