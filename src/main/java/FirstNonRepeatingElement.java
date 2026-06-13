public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 4, 1, 5, 7};
        int currentElement = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            currentElement = numbers[i];
            boolean isRepeating = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j)
                    continue;
                if (numbers[j] == numbers[i]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                System.out.println(currentElement);
                return;
            }


        }
        System.out.println("No non-repeating element found.");
    }
}
