public class SumofArray {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 14, 55, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of array is " + sum);
    }
}
