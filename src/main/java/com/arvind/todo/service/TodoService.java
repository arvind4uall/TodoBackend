package com.arvind.todo.service;

import com.arvind.todo.entity.TodoTaskEntity;
import com.arvind.todo.springdata.TodoTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
  @Autowired
  TodoTaskRepository repository;
  public List<TodoTaskEntity> getTasks() {
    return repository.findAll();
  }
  public TodoTaskEntity createTask(TodoTaskEntity todoTask){
    return repository.save(todoTask);
  }

  public TodoTaskEntity updateTask(TodoTaskEntity todoTask){
    return repository.save(todoTask);
  }

  public String deleteTask(String id){
    repository.deleteById(id);
    return "Task Deleted successfully";
  }

  public String deleteAllTask(){
    repository.deleteAll();
    return "All data deleted";
  }

}
