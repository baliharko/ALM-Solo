package com.example.springdocker.service;

import com.example.springdocker.model.Animal;
import com.example.springdocker.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public void saveNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public List<Animal> getFlyingAnimals() {
        return animalRepository.findByFlying(true);
    }

    public List<Animal> getMammals() {
        return animalRepository.findByMammal(true);
    }
}
