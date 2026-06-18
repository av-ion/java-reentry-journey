package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingMissingValues {
    public static void main(String[] args) {
        Set<Integer>  expected = Set.of();
        Set<Integer> actual = Set.of(2, 4);
        System.out.println(findMissingValues(expected,actual));


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
}
