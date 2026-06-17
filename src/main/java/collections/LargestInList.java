package collections;

import java.util.Arrays;
import java.util.List;

public class LargestInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 8, 2, 10);
        System.out.println(findLargest(numbers));
    }
    public static int findLargest(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty())
            throw new IllegalArgumentException("List can't b null/empty");
        int largest = numbers.getFirst();
        for(Integer num :numbers){
            if(num == null)
                throw new IllegalArgumentException("List has null value");

            if (largest < num)
                largest = num;


        }
        return largest;
    }
}
