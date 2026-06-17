package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 1, 2, 1, 2, 1);
        System.out.println(buildFrequencyMap(numbers).toString());
        System.out.println(findMostFrequentElement(numbers));
    }

    public static Map<Integer, Integer> buildFrequencyMap(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty())
            throw new IllegalArgumentException("List can't be null/empty");

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : numbers) {
            if (num == null) throw new IllegalArgumentException("List has null values");
            int val = frequencyMap.getOrDefault(num, 0);
            frequencyMap.put(num, ++val);
        }

        return frequencyMap;

    }

    public static int findMostFrequentElement(List<Integer> numbers) {
        Map<Integer, Integer> freqMap = buildFrequencyMap(numbers);
        int freqElement = numbers.getFirst();
        int count = 0;
        for (Integer i : freqMap.values()) {
            if (i > count)
                count = i;
        }
        for (Integer i : numbers) {
            if (freqMap.get(i) == count) {
                freqElement = i;
                break;
            }

        }
        return freqElement;
    }
}
