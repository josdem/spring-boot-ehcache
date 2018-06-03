package com.jos.dem.springboot.cache.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.repository.PersonRepository;
import com.jos.dem.springboot.cache.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

  @Autowired
  private PersonRepository personRepository;

  public List<Person> getAll(){
    return personRepository.findAll();
  }

}
