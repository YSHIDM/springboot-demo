package com.yshidm.demo;

import static org.junit.Assert.*;
// import static org.hamcrest.Matchers.*;

// import com.yshidm.demo.model.Todo;
// import com.yshidm.demo.service.ITodoService;
// import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class UnitTest {

  // @Autowired
  // private ITodoService todoService;

  @Test
  public void testA() {
        // var todo = new Todo("测试", "plan", "内容");
        // var todo = new Todo("TODO001", "测试", "plan", "内容", false, false);
        // System.out.println(todo);
        // todo = todoService.saveTodo(todo);
        // System.out.println(todo);

        // var t = todoService.findAll();

        // System.out.println(t.toString());

    var words = "Hello World";
    var hello = new String(words);

    log.info("[比较]: {} 和 {}", words, hello);
    System.out.println("汉字 111");
    assertEquals(words, hello);
  }
}
