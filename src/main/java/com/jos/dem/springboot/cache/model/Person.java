package com.jos.dem.springboot.cache.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  private String nickname;
  private String email;

}
