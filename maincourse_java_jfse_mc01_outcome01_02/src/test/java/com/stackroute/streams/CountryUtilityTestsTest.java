package com.stackroute.streams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CountryUtilityTestsTest{
    CountryUtility countryUtility;
    List<String> listCountry;
    Map<String,String> map;
    @BeforeEach
    void setUp() {
        countryUtility=new CountryUtility();
        listCountry=new ArrayList<>();
        listCountry.add("India-Delhi");
        listCountry.add("Comoros-Moroni");
        listCountry.add("Canada-Ottawa");
        listCountry.add("Australia-Canberra");
        listCountry.add("China-Beijing");
        listCountry.add("Cuba-Havana");
        listCountry.add("USA-Washington");
        map=new HashMap<>();
        map.put("India","Delhi");
        map.put("Canada","Ottawa");
        map.put("Russia","Moscow");
        map.put("USA","Washington");
        map.put("Japan","Tokyo");

    }
    @Test
    void getCountryByCapitalTest()
    {
        assertEquals("India",countryUtility.getCountryByCapital(map,"Delhi"));
    }
    @ValueSource(strings={"India-deLhi","Cuba-Havana","Australia-Canberra","China-Beijing"})
    void  searchCountryTest(String string)
    {
        assertTrue(countryUtility.searchCountry(listCountry,string));
    }
    @ValueSource(strings={""," "})
    void searchCountryEmptyTest(String string)
    {
        assertFalse(countryUtility.searchCountry(listCountry,string));
    }
    @ValueSource(strings={"Indian-cube","Nepal-Kathmandu","Bhutan-thimphu"})
    void searchFruitFalseTest(String string){

        assertFalse(countryUtility.searchCountry(listCountry,string));
    }
}