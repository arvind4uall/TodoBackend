package com.arvind.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Name;

import java.util.Date;

@Entity
@Table(name = "todo")
public class TodoTaskEntity {
  @Id
  private String id;
  private String name;
  private boolean completed;
  private String date;


  public TodoTaskEntity(String id, String date, String name, boolean completed) {
    this.id = id;
    this.name = name;
    this.completed = completed;
    this.date = date;
  }

  public TodoTaskEntity() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return "TodoTaskEntity{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", completed=" + completed +", date=" + date +
            '}';
  }
}
