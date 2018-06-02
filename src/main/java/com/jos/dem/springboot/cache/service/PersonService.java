package com.jos.dem.springboot.cache.service;

import java.util.List;
import com.jos.dem.springboot.cache.model.Person;

public interface PersonService {
  List<Person> getAll();
}
