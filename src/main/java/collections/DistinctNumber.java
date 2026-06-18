package collections;

import java.util.*;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,5,1,7,2,3);
        System.out.println(findDistinctNumbersPreservingOrder(numbers));

    }
    public static Set<Integer> findDistinctNumbers(List<Integer> numbers){
        if(numbers == null)
            throw new IllegalArgumentException("List is null");

        Set<Integer> distinctNumbers = new HashSet<>(numbers);

        return Collections.unmodifiableSet(distinctNumbers);
    }

    public static Set<Integer> findDistinctNumbersPreservingOrder(List<Integer> numbers){
        if(numbers == null)
            throw new IllegalArgumentException("List is null");

        Set<Integer> distinctNumbers = new LinkedHashSet<>(numbers);

        return Collections.unmodifiableSet(distinctNumbers);
    }
}
