package com.stackroute.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Utility class for analyzing fruit names in a List
 * Complete the class as per the requirements given in PROBLEM.md
 */
public class FruitUtil {

    public boolean searchFruit(List<String> fruits, String searchFruit) {
        boolean isListContainsFruit = searchFruit.equals(null)? false:
                ((searchFruit.length()==0)? false:
                        ((fruits.stream().anyMatch(searchFruit::equalsIgnoreCase))? true : false));
        return isListContainsFruit;
    }

    public Optional<List<String>> sortFruits(List<String> fruits) {
        if(fruits==null||fruits.isEmpty()) {
            return Optional.empty();
        }
        List<String> listSortedFruit = fruits.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return Optional.ofNullable(fruits);
    }


    public String getFruitByTaste(Map<String, String> fruits, String searchTaste) {
        if(fruits==null || fruits.isEmpty() || searchTaste==null){
            return null;
        }
        Optional<Map.Entry<String,String>> searchedFruitByTaste = fruits.entrySet().stream().
                filter(entry -> entry.getValue().equalsIgnoreCase(searchTaste)).findFirst();

        if(searchedFruitByTaste.isPresent()) return searchedFruitByTaste.get().getKey();
        else throw new FruitNotFoundException("Fruit Not Found in this Map.");
    }
}

