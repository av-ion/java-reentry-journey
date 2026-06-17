package collections;

import java.util.Arrays;
import java.util.List;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, null, 2, 2, 5);

        System.out.println(countOccurrences(numbers, -2));

    }

    public static int countOccurrences(List<Integer> numbers, int target) {
        int counter = 0;

        if (numbers == null || numbers.isEmpty()){
            throw new IllegalArgumentException("List can't be null/empty");

        }
        for(Integer num :numbers){
            if(num == null)
                throw new IllegalArgumentException("List has null value");

            if(num == target)
                counter++;
        }
        return counter;
    }
}
