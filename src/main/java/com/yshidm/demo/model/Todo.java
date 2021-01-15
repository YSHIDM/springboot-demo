package com.yshidm.demo.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {

  public Todo() {
  }

  public Todo(String id, String title, String node, String content, Boolean isArchive, Boolean isClose) {
    this.id = id;
    this.title = title;
    this.node = node;
    this.content = content;
    this.isArchive = isArchive;
    this.isClose = isClose;
  }
  public Todo(String title, String node, String content) {
    this.id = UUID.randomUUID().toString().replace("-", "");
    this.title = title;
    this.node = node;
    this.content = content;
    this.isArchive = false;
    this.isClose = false;
  }
  /**
   * Column 格式
   * @Column(name = "use_phone", nullable = false, length = 20)
   */

  @Id
  @Column(length = 32)
  private String id;

  @Column(length=50)
  private String title;
  @Column(length=10)
  private String node;
  @Column(length=100)
  private String content;
  private Boolean isArchive;
  private Boolean isClose;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNode() {
    return this.node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Boolean isIsArchive() {
    return this.isArchive;
  }

  public Boolean getIsArchive() {
    return this.isArchive;
  }

  public void setIsArchive(Boolean isArchive) {
    this.isArchive = isArchive;
  }

  public Boolean isIsClose() {
    return this.isClose;
  }

  public Boolean getIsClose() {
    return this.isClose;
  }

  public void setIsClose(Boolean isClose) {
    this.isClose = isClose;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Todo)) {
      return false;
    }
    Todo todo = (Todo) o;
    return Objects.equals(id, todo.id) && Objects.equals(title, todo.title) && Objects.equals(node, todo.node)
        && Objects.equals(content, todo.content) && Objects.equals(isArchive, todo.isArchive)
        && Objects.equals(isClose, todo.isClose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, node, content, isArchive, isClose);
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", title='" + getTitle() + "'" + ", node='" + getNode() + "'" + ", content='"
        + getContent() + "'" + ", isArchive='" + isIsArchive() + "'" + ", isClose='" + isIsClose() + "'" + "}";
  }

}
