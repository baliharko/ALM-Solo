package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    Long id;
    String name;
    boolean mammal;
    boolean flying;

    public Animal(String name) {
        this.name = name;
    }
 }
