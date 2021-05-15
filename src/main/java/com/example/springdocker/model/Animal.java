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
    boolean isMammal;
    boolean isFlying;

    public Animal(String name) {
        this.name = name;
    }
 }
