public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 4, 22, 8, 0, -9};
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Odd Count = "+odd+"\nEven Count = "+even);
    }
}
