package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class AccountResource {
  private final AccountRepository accountRepository;

  @Autowired
  public AccountResource(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Account> getUserById(@PathVariable Long id) {
    Account account =
        accountRepository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    return ResponseEntity.ok(account);
  }
}
