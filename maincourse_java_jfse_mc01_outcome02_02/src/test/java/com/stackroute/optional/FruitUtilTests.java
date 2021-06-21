package com.stackroute.optional;
import com.stackroute.optional.FruitUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/* Complete the class as per the requirements given in PROBLEM.md */
public class FruitUtilTests {
    FruitUtil fruitUtil;
    List<String> fruitsList;
    Map<String, String> fruits;

    @BeforeEach
    void setUp() {
        //create a object of FruitUtil class
        fruitUtil = new FruitUtil();
        //create a ArrayList object
        fruitsList = new ArrayList<>();
        //add data in the ArrayList
        fruitsList.add("Mango-Sweet");
        fruitsList.add("Blueberry-Sweet");
        fruitsList.add("Lemons-Sour");
        fruitsList.add("Banana-Sweet");
        fruitsList.add("Blackcurrant-Tart");
        fruitsList.add("Apple-Salty");
        fruitsList.add("Grapes-Salty");

        //create a Map object
        fruits = new HashMap<>();
        //put the data in the Map
        fruits.put("Mango","Sweet");
        fruits.put("Blueberry","Sweet");
        fruits.put("Lemons","Sour");
        fruits.put("Banana","Sweet");
        fruits.put("Blackcurrant","Tart");
        fruits.put("Apple","Salty");
        fruits.put("Grapes","Salty");

    }



    @Test
    void sortFruitNullTest () {
        List<String> list = null;
        Optional<List<String>> expected = Optional.empty();
        assertEquals(expected, fruitUtil.sortFruits(list));
    }

    @Test
    void sortFruitTest () {
        List<String> expectedList = fruitsList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Optional<List<String>> expected = Optional.ofNullable(fruitsList);
        assertEquals(expected, fruitUtil.sortFruits(fruitsList));
    }

    @Test
    void getFruitByTasteTest() {
        Assertions.assertEquals("Apple", fruitUtil.getFruitByTaste(fruits,"salty"));
    }

    @Test
    void getFruitByTasteFailTest() {
        Assertions.assertNotEquals("Pomegranate", fruitUtil.getFruitByTaste(fruits,"salty"));
    }

    @Test
    void getFruitByTasteTestExpectedException() {
        Assertions.assertThrows(FruitNotFoundException.class, () -> {
            fruitUtil.getFruitByTaste(fruits,"Bitter");
        });
    }


    @Test
    void sortFruitCheckEmptyListTest () {
        Assertions.assertTrue(fruitUtil.sortFruits(fruitsList).isPresent());
    }


}
