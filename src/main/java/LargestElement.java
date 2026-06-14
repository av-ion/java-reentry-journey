public class LargestElement {

    public static void main(String[] args) {

        int[] numbers = {55, 4, 22, 87, 69};

        System.out.println("Largest number is " + findLargest(numbers));


    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}

