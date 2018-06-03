package com.jos.dem.springboot.cache;

import java.util.List;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.repository.PersonRepository;

@SpringBootApplication
public class DemoApplication {

  private List<Person> persons = Arrays.asList(
    new Person(1, "josdem", "joseluis.delacruz@gmail.com"),
    new Person(2, "tgrip", "tgrip@email.com"),
    new Person(3, "edzero", "edzero@email.com"),
    new Person(4, "jeduan", "jeduan@email.com"),
    new Person(5, "edrix", "siedrix@email.com")
  );


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

  @Bean
  CommandLineRunner start(PersonRepository personRepository){
    return args -> {
      personRepository.deleteAll();
      persons.forEach(person -> personRepository.save(person));
    };
  }

}
