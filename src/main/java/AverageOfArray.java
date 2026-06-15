public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = null;

        double average = findAverage(numbers);

        //System.out.println("Average: " + average);
        System.out.println(containsZero(numbers));

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
}

