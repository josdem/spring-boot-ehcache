package com.jos.dem.springboot.cache.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.service.PersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PersonController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private PersonService personService;

  @RequestMapping("/")
  public List<Person> index(){
    log.info("Calling get all persons");
    return personService.getAll();
  }

}
