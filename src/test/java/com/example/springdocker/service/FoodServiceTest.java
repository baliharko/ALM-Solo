package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FoodServiceTest {

    FoodService foodService;

    @Mock
    FoodRepository mockRepository;

    @BeforeEach
    public void init() {
        foodService = new FoodService(mockRepository);
    }

    @Test
    public void getCookableFoodsTest() {
        when(mockRepository.findFoodByCanICookIt(true)).thenReturn(Arrays.asList(new Food("TestFood")));

        String expected = "TestFood";
        String actual = foodService.getCookableFoods().get(0);

        assertEquals(expected, actual);
        verify(mockRepository).findFoodByCanICookIt(true);
    }
}