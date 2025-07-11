package com.Dunes.todoapp.Controller;

import com.Dunes.todoapp.Models.Task;
import com.Dunes.todoapp.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// i only added this controller and their respective repo,service and model to test a loading cafe page
@Controller
//@RequestMapping("/Tasks")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks (Model model)
    {
        List <Task> tasks = taskService.getAllTasks() ;
        model.addAttribute("tasks", tasks);
        return "tasks";

    }
    @PostMapping("/add")
    public String Createtask (@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String DeleteTask(@PathVariable long id ){
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable long id ){
        taskService.toggleTask(id);
        return "redirect:/";
    }


}
