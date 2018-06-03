package com.jos.dem.springboot.cache.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jos.dem.springboot.cache.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Person save(Person person);
  List<Person> findAll();
	void deleteAll();

}
