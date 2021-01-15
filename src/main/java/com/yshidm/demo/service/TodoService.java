package com.yshidm.demo.service;

import java.util.List;

import com.yshidm.demo.model.Todo;
import com.yshidm.demo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService implements ITodoService {

  @Autowired
  private TodoRepository repository;

  @Override
  public List<Todo> findAll() {
    return (List<Todo>) repository.findAll();
  }

  @Override
  public Todo saveTodo(Todo todo) {
    log.info("todo", todo.toString());
    return repository.save(todo);
  }

}
