package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    void testFelineInterfaceMethods() {
        // Создаем тестовую реализацию интерфейса Feline
        Feline feline = new Feline() {
            @Override
            public int getKittens() {
                return 1;
            }

            @Override
            public List<String> eatMeat() {
                return List.of("Животные", "Птицы", "Рыба");
            }
        };

        // Проверяем методы интерфейса
        assertEquals(1, feline.getKittens());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
} 