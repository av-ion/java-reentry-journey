import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 2, 3, 4, 4, 5,8};
        int prevElement = numbers[0];
        int[] uniqueNumbers = new int[numbers.length];
        uniqueNumbers[0] = prevElement;
        int j = 1;

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != prevElement) {
                prevElement = numbers[i];
                uniqueNumbers[j++] = prevElement;
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOf(uniqueNumbers, j)));
        System.out.println("Count of unique numbers : " + j);
    }
}
