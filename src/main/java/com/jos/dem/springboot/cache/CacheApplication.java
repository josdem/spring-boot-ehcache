package com.jos.dem.springboot.cache;

import java.util.List;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jos.dem.springboot.cache.model.Person;
import com.jos.dem.springboot.cache.repository.PersonRepository;

@SpringBootApplication
@EnableCaching
public class CacheApplication {

  private List<Person> persons = Arrays.asList(
    new Person(1L, "josdem", "joseluis.delacruz@gmail.com"),
    new Person(2L, "tgrip", "tgrip@email.com"),
    new Person(3L, "edzero", "edzero@email.com"),
    new Person(4L, "jeduan", "jeduan@email.com"),
    new Person(5L, "edrix", "siedrix@email.com")
  );


	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

  @Bean
  CommandLineRunner start(PersonRepository personRepository){
    return args -> {
      personRepository.deleteAll();
      persons.forEach(person -> personRepository.save(person));
    };
  }

}
