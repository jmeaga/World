package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class spring1 {
 private String StudentName="IamNeo";
 @GetMapping("/s")
 public String getName() {
  return "Welcome "+StudentName;
 }

}

