package com.ms.todo.app.TodoApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.todo.app.TodoApp.model.Todo;
import com.ms.todo.app.TodoApp.repository.TodoRepository;

@Service
public class TodoService {

  @Autowired
  private TodoRepository todoRepository;
  
  public List<Todo> getAll() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos :: add);
    return todos;
  }
  
  public void addTodoItem(Todo item) {
    todoRepository.save(item);
  }
  
  public void updateTodoItem(Todo item) {
    todoRepository.save(item);
  }
  
  public void deleteTodoItem(int id) {
    todoRepository.deleteById(id);
  }
  
  public Todo getTodo(int id){
    return todoRepository.findById(id).get();
  }

}
