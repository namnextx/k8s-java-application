package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/test")
public class TestController {

  @GetMapping
  public ResponseEntity<String> getTestResponse() {
    String responseMessage = "Hello google cloud";
    return ResponseEntity.ok(responseMessage);
  }
}
