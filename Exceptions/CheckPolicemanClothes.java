package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPolicemanClothes {
    private static final ArrayList<String> badClothes = new ArrayList<>(Arrays.asList("халат", "пижама", "шлёпки"));
    public static void check(String s){
        s = s.toLowerCase();
        String[] words = s.split("[\\s\\,\\.]+");
        for(String word : words){
            if(badClothes.contains(word)) throw new BadClothesException();
        }
    }
}

