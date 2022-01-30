package com.example.springweb2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

  private final Set<Employee> employees = new HashSet<>();

  @GetMapping
  public String listEmployees(@RequestParam(required = false) Integer limit, Model model) {
    model.addAttribute("employees", employees);
    return "index";
  }

//  The @ModelAttribute is an annotation that binds a method parameter or method return value to
//  a named model attribute and then exposes it to a web view.
//  We can put the @Valid annotation on method parameters and fields to tell Spring that we
//  want a method parameter or field to be validated
  @PostMapping("/add")
  public String addEmployee(@ModelAttribute Employee employee){
    employees.add(employee);
    return "redirect:/employees";
  }

  @GetMapping("/addEmployee")
  public String addEmployeeForm(Model model){
    model.addAttribute("employee", new Employee());
   return "add-employee";
  }
}
