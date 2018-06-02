package com.jos.dem.springboot.cache.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.service.PersonService;

@RestController
public class PersonController {

  @Autowired
  private PersonService personService;

  @RequestMapping("/")
  public List<Person> index(){
    return personService.getAll();
  }

}
