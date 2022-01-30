package com.example.springweb2;

import javax.validation.constraints.*;

public class Employee {

  @NotNull
  @NotEmpty
  private Long id;
  @NotNull
  private String firstName;
  @NotBlank
  private String lastName;
  @Min(20)
  @Max(80)
  private int age;
  @NotEmpty
  private String position;
  @Email
  private String email;

  public Employee() {
  }

  public Employee(Long id, String firstName, String lastName, int age, String position, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.position = position;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", position='" + position + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
