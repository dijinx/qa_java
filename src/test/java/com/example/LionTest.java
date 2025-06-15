package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    private Feline feline;

    @ParameterizedTest
    @CsvSource({
        "Самец, true",
        "Самка, false"
    })
    void constructorSetsCorrectManeValue(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test
    void constructorThrowsExceptionForInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неизвестный", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    void getKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    void getFoodReturnsCorrectFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
} 