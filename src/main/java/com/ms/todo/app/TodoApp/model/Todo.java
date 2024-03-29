package com.ms.todo.app.TodoApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
  
  @Id
  private int id;
  private String title;
  private boolean completed;

  public Todo() {
    
  }
  public Todo(int id, String title, boolean completed) {
    this.id = id;
    this.title = title;
    this.completed = completed;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}
