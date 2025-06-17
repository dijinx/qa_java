package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void getKittensReturnsOne() {
        Cat cat = new Cat();
        assertEquals(1, cat.getKittens());
    }

    @Test
    void eatMeatReturnsCorrectFoodList() {
        Cat cat = new Cat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, cat.eatMeat());
    }
} 