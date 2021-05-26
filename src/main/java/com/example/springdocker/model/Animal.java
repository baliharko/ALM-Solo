package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    String id;
    String name;
    boolean mammal;
    boolean flying;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, boolean mammal, boolean flying) {
        this.name = name;
        this.mammal = mammal;
        this.flying = flying;
    }
 }
