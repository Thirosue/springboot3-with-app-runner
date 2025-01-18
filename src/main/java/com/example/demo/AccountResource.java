package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class AccountResource {

  @GetMapping("/{id}")
  public ResponseEntity<String> getUserById(@PathVariable Long id) {
    return ResponseEntity.ok("test");
  }
}
