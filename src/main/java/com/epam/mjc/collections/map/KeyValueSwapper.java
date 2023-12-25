package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        if (!sourceMap.isEmpty())
            for (Integer enity :
                    sourceMap.keySet()) {
                if (!result.containsKey(sourceMap.get(enity))) {
                    result.put(sourceMap.get(enity), enity);
                } else if (result.get(sourceMap.get(enity)) > enity) {
                    result.put(sourceMap.get(enity), enity);
                }
            }

        return result;
    }
}
