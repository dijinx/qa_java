package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AlexTest {

    @Mock
    private Feline feline;

    @Test
    void getKittensReturnsZero() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    void getFriendsReturnsCorrectList() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    void getPlaceOfLivingReturnsCorrectPlace() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void hasManeIsTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void getFoodReturnsCorrectFoodList() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, alex.getFood());
    }
} 