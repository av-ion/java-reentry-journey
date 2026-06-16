import java.util.NoSuchElementException;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,2,2};

        double average = findAverage(numbers);

        //System.out.println("Average: " + average);
        System.out.println(findMajorityElement(numbers));

    }

    public static double findAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;

    }

    public static int countPositiveNumbers(int[] numbers) {
        if (numbers == null) return -1;
        if (numbers.length == 0) return 0;
        int count = 0;
        for (int num : numbers) {
            if (num > 0) count++;
        }
        return count;
    }

    public static int findFirstNegative(int[] numbers) {
        if (numbers == null) {
            return -1;
        }
        for (int num : numbers) {
            if (num < 0) return num;
        }
        return -1;
    }

    public static boolean containsZero(int[] numbers) {
        if (numbers == null) return false;
        for (int num : numbers) {
            if (num == 0) return true;
        }
        return false;
    }

    public static int findSecondSmallest(int[] numbers) {
        if (numbers == null || numbers.length <= 1)throw new IllegalArgumentException("Empty Array/ single element array");//temporary exception
        int smallest =Integer.MAX_VALUE;
        int secSmall =Integer.MAX_VALUE;


        for (int num : numbers) {
           if(num <smallest){
               secSmall = smallest;
               smallest = num;
           }
           else if(num > smallest && num <secSmall){
               secSmall = num;
           }

        }
        if (secSmall == Integer.MAX_VALUE)
            throw new IllegalArgumentException("No second smallest");
        return secSmall;
    }

    public static int findLargestConsecutiveDifference(int[] numbers){
        if(numbers== null || numbers.length <2) throw new IllegalArgumentException("Array is invalid");
        int difference = 0;
        for(int i = 1;i < numbers.length; i++){
            if(Math.abs(numbers[i] - numbers[i-1]) > difference) {
                difference = Math.abs(numbers[i] - numbers[i-1]);


            }
        }
        return difference;
    }

    public static int findMajorityElement(int[] numbers) {
        if (numbers == null || numbers.length<2) throw new IllegalArgumentException("Array is invalid");
        int majorityCount = numbers.length / 2;
        int count = 0;
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            int temp = 0;

            for (int j = i; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    temp++;
                }
            }
            if (temp > count) {
                count = temp;
                num = numbers[i];
            }

        }
        if (count > majorityCount) return num;
        else throw new NoSuchElementException("No majority element exists");
    }
}
