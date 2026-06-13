public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 10, 6, 4, 30};
        int smallest = numbers[0];
        int difference = numbers[1] - numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - smallest > difference) {
                difference = numbers[i] - smallest;


            }
            if (smallest > numbers[i])
                smallest = numbers[i];
        }


        System.out.println(difference);


    }
}










