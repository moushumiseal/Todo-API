package com.ms.todo.app.TodoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.todo.app.TodoApp.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
