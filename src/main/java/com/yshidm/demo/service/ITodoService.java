package com.yshidm.demo.service;

import java.util.List;

import com.yshidm.demo.model.Todo;

public interface ITodoService {

  List<Todo> findAll();

  Todo saveTodo(Todo todo);
}
