package com.yshidm.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yshidm.demo.service.ITodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class TodoController {
  @Autowired
  private ITodoService todoService;

  @RequestMapping(value="todoList")
  @ResponseBody
  public String index() {

    var todoList = todoService.findAll();
    log.info("findAll: " + todoList);

    ObjectMapper mapper = new ObjectMapper();

    String result = null;

    try {
      result = mapper.writeValueAsString(todoList);
    } catch (Exception e) {
      return "[]";
    }

    return result;
  }
}
