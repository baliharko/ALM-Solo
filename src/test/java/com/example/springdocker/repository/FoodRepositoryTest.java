package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class FoodRepositoryTest {

    @Autowired
    FoodRepository testRepository;

    @Test
    @DisplayName("FoodRepository - findFoodByCanICookIt")
    public void findFoodByCanICookItTest() {
        String expectedName = "testfood";

        Food testFood = new Food();
        testFood.setCanICookIt(true);
        testFood.setName("testfood");

        testRepository.save(testFood);

        assertTrue(testFood.getName().equalsIgnoreCase(expectedName));
    }
}