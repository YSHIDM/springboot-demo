package com.yshidm.demo;

import static org.junit.Assert.*;
// import static org.hamcrest.Matchers.*;

import com.yshidm.demo.model.Todo;
import com.yshidm.demo.service.ITodoService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UnitTest {

  @Autowired
  private ITodoService todoService;

  @Test
  public void testA() {
    // var todo = new Todo("测试", "plan", "内容");
    var todo = new Todo("TODO001", "测试", "plan", "内容", false, false);
    System.out.println(todo);
    todo = todoService.saveTodo(todo);
    System.out.println(todo);

    var t = todoService.findAll();

    System.out.println(t.toString());

    var words = "Hello World";
    var hello = new String(words);

    assertEquals(words, hello);
  }
}
