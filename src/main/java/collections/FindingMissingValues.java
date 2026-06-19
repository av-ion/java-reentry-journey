package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingMissingValues {
    public static void main(String[] args) {
        Set<String>  expected = Set.of("A", "B", "C");
        Set<String> actual = Set.of("A", "B");
        System.out.println(findUnexpectedValues(expected,actual));


    }
    public static Set<Integer> findMissingValues(
            Set<Integer> expected,
            Set<Integer> actual){
        Set<Integer> missing = new LinkedHashSet<>();
        if(expected == null) throw  new IllegalArgumentException("Expected can't be null");
        if(actual == null) throw new IllegalArgumentException("Actual can't be null");

        for(Integer val : expected){
            if(!actual.contains(val))
              missing.add(val);
        }
        return Collections.unmodifiableSet(missing);
    }


public static Set<String> findUnexpectedValues(Set<String> allowed,Set<String> received){
        if(allowed == null) throw new IllegalArgumentException("allowed values can't be null");
        if(received == null) throw new IllegalArgumentException("Received value can't be null");
        Set<String> unexpected = new LinkedHashSet<>();

        for(String i : received){
            if(!allowed.contains(i))
                unexpected.add(i);
        }
        return Collections.unmodifiableSet(unexpected);

}}
