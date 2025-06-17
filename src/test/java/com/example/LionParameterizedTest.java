package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionParameterizedTest {

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

    @ParameterizedTest
    @CsvSource({
        "Неизвестный",
        "Лев",
        "Тигр"
    })
    void constructorThrowsExceptionForInvalidSex(String invalidSex) {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(invalidSex, feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
} 