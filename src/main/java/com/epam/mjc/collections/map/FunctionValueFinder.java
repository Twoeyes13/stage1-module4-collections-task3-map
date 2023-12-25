package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer entity:
                functionMap.keySet()) {
            if (functionMap.get(entity) == requiredValue) {
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new HashMap<>();
        if (!sourceList.isEmpty())
            for (Integer entity :
                    sourceList) {
                result.put(entity, 5 * entity + 2);
            }
        return result;
    }
}
