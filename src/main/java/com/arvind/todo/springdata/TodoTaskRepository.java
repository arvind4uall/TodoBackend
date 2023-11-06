package com.arvind.todo.springdata;

import com.arvind.todo.entity.TodoTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoTaskRepository extends JpaRepository<TodoTaskEntity,String> {
}
