package com.arvind.todo.controller;
import com.arvind.todo.entity.TodoTaskEntity;
import com.arvind.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {
  @Autowired
  TodoService service;

  @GetMapping("/")
  public List<TodoTaskEntity> getAllTasks(){
    return service.getTasks();
  }

  @PostMapping("/createTodo")
  public TodoTaskEntity createTodo(@RequestBody TodoTaskEntity todoTask){
    return service.createTask(todoTask);
  }

  @PutMapping("/updateTodo")
  public TodoTaskEntity updateTodo(@RequestBody TodoTaskEntity todoTask){
    return service.updateTask(todoTask);
  }

  @DeleteMapping("/deleteTodo")
  public String deleteTask(@RequestParam String id){
    return service.deleteTask(id);
  }

  @GetMapping("/deleteAll")
  public String deleteAll(){
    return service.deleteAllTask();
  }
}
