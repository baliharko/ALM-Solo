package com.example.springdocker.service;

import com.example.springdocker.model.Animal;
import com.example.springdocker.repository.AnimalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AnimalServiceTest {

    AnimalService animalService;

    @Mock
    AnimalRepository mockRepository;

    @BeforeEach
    public void init() {
        animalService = new AnimalService(mockRepository);
    }

    @Test
    public void saveNewAnimalTest() {
       when(mockRepository.save(any())).thenReturn(new Animal("SavedAnimal"));

       animalService.saveNewAnimal(new Animal());
       verify(mockRepository).save(any());
    }

    @Test
    public void getMammalsTest() {

        Animal testAnimal = new Animal();
        testAnimal.setMammal(true);
        when(mockRepository.findByMammal(true)).thenReturn(Arrays.asList(testAnimal));

        List<Animal> mammalsList = animalService.getMammals();
        verify(mockRepository).findByMammal(true);
    }

    @Test
    public void getMammalsThrowExceptionTest() {
        when(mockRepository.findByMammal(true)).thenThrow(ArrayIndexOutOfBoundsException.class);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> animalService.getMammals());
        verify(mockRepository, times(1)).findByMammal(true);
    }
}