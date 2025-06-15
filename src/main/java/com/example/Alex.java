package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {
    private static final List<String> FRIENDS = Arrays.asList("Марти", "Глория", "Мелман");
    private static final String PLACE_OF_LIVING = "Нью-Йоркский зоопарк";

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return FRIENDS;
    }

    public String getPlaceOfLiving() {
        return PLACE_OF_LIVING;
    }

    @Override
    public int getKittens() {
        return 0;
    }
} 