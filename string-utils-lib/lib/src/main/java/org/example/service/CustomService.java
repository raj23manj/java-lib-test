package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class CustomService {
  public String greet(String name) {
    return "Hello, " + name;
  }
}
