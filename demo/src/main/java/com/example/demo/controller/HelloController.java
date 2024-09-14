package com.example.demo.controller;

import org.example.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private CustomService customService;

  @GetMapping("/")
  public String index() {
    return customService.greet("Hola first Lib");
  }

}