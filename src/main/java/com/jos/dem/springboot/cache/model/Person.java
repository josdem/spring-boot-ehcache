package com.jos.dem.springboot.cache.model;

import javax.persistence.Id;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

  @Id
  private Long id;
  private String nickname;
  private String email;

}
