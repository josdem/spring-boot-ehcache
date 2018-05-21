package com.jos.dem.springboot.cache.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PersonController {

  RequestMapping("/")
  public String index(){
    return "Hello World!";
  }

}
