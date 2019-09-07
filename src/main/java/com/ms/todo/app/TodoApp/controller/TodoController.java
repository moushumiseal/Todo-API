package com.ms.todo.app.TodoApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.todo.app.TodoApp.model.Todo;
import com.ms.todo.app.TodoApp.service.TodoService;

@RestController
public class TodoController {
  
  @Autowired
  private TodoService todoService;
  
  @GetMapping("/todos")
  public List<Todo> getAll(){
    List<Todo> todos= new ArrayList<>();
    todoService.getAll().forEach(todos :: add);
    return todos;
  }
  
  @GetMapping("/todos/{id}")
  public Todo getById(@PathVariable int id){
    return todoService.getTodo(id);
  }
  
  @PutMapping("/todos/{id}")
  public String updateById(@PathVariable int id, @RequestBody Todo todo){
    todoService.updateTodoItem(todo);
    return "Updated";
  }
  
  @PostMapping("/todos")
  public String add(@RequestBody Todo todo){
    todoService.addTodoItem(todo);
    return "Added";
  }
  
  @DeleteMapping("/todos/{id}")
  public String delete(@PathVariable int id){
    todoService.deleteTodoItem(id);
    return "Added";
  }
}
