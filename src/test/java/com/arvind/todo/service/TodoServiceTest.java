package com.arvind.todo.service;

import com.arvind.todo.entity.TodoTaskEntity;
import com.arvind.todo.springdata.TodoTaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {
  @Mock
  TodoTaskRepository todoTaskRepository;

  @InjectMocks
  TodoService todoService;

  @Test
  void getTasksTest() {
    Mockito.when(todoTaskRepository.findAll()).thenReturn(Arrays.asList(new TodoTaskEntity(), new TodoTaskEntity()));
    List<TodoTaskEntity> tasks = todoService.getTasks();
    assertEquals(2, tasks.size());
  }

  @Test
  void createTaskTest() {
    TodoTaskEntity todoTaskEntity = new TodoTaskEntity();
    Mockito.when(todoTaskRepository.save(todoTaskEntity)).thenReturn(todoTaskEntity);
    assertEquals(todoTaskEntity, todoService.createTask(todoTaskEntity));
  }

  @Test
  void updateTaskTest() {
    TodoTaskEntity todoTaskEntity = new TodoTaskEntity();
    Mockito.when(todoTaskRepository.save(todoTaskEntity)).thenReturn(todoTaskEntity);
    assertEquals(todoTaskEntity, todoService.updateTask(todoTaskEntity));
  }

  @Test
  void deleteTaskTest() {
    String id = "1";
    doNothing().when(todoTaskRepository).deleteById(id);
    assertEquals("Task Deleted successfully", todoService.deleteTask(id));
    // verify that the mock was called as expected with verify(..., times(1))....
    verify(todoTaskRepository, times(1)).deleteById(id);
  }


}