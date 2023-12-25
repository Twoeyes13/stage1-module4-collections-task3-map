package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.toLowerCase().replaceAll("[.,]", "").split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String enity :
                words) {
            if (result.containsKey(enity)) {
                int value = result.get(enity) + 1;
                result.put(enity, value);
            } else if (enity != null && !enity.isEmpty()) {
                result.put(enity, 1);
            }
        }
        return result;
    }
}
