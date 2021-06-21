package com.stackroute.streams;
import javax.swing.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Complete the class as per the requirements given in PROBLEM.md */
public class CountryUtility{
    public boolean searchCountry(List<String> countries,String searchCountry)
    {
        boolean isListContainsCountry=searchCountry.equals(null)? false:
                ((searchCountry.length()==0)? false:((countries.stream().
                        anyMatch(searchCountry::equalsIgnoreCase))? true: false));
        return isListContainsCountry;

    }
    public Optional<List<String>> sortCountries(List<String> countries) {
        if (countries == null || countries.isEmpty()) {
            return Optional.empty();
        }
        List<String> sortedCountriesList = countries.stream().sorted()
                .collect(Collectors.toList());
        return Optional.of(sortedCountriesList);
    }
    public Set<String> getDistinctCountriesInUpperCaseSortedByLength(List<String> countries)
    {
        if(countries==null || countries.isEmpty())
        {
            return Collections.emptySet();

        }
        else
        {
            return countries.stream().map(String::toUpperCase).collect(Collectors.toSet());
        }

    }
    public String getCountryByCapital(Map<String,String> countriesMap,String searchCapital)
    {
        if(countriesMap==null||searchCapital==null)
            return null;
        Optional<Map.Entry<String,String>> countryOptional=countriesMap.entrySet().stream()
                .filter(entry->entry.getValue().equalsIgnoreCase(searchCapital)).findFirst();
        if(countryOptional.isPresent
                ())
            return countryOptional.get().getKey();
        else throw new CountryNotFoundException("country not found in this");


    }
}


