package com.jos.dem.springboot.cache.service.impl;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

  private List<Person> persons = Arrays.asList(
    new Person("josdem", "joseluis.delacruz@gmail.com"),
    new Person("tgrip", "tgrip@email.com"),
    new Person("edzero", "edzero@email.com"),
    new Person("jeduan", "jeduan@email.com"),
    new Person("edrix", "siedrix@email.com")
  );

  public List<Person> getAll(){
    return persons;
  }

}
