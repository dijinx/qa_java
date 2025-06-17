package com.example;

import java.util.List;

public class Cat implements Feline {
    @Override
    public int getKittens() {
        return 1;
    }

    @Override
    public List<String> eatMeat() {
        return List.of("Животные", "Птицы", "Рыба");
    }
} 