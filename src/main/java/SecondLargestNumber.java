public class SecondLargestNumber {
    public static void main(String[] args) {


        int[] number = {245, 240,500,-8,246};

        int largest = number[0];
        int secLarge = number[1];

        for(int i=1;i<number.length;i++){

            if (largest < number[i]) {
                secLarge = largest;
                largest = number[i];
            } else if (secLarge < number[i])
                secLarge = number[i];
        }

        System.out.println("Second largest is "+secLarge);


    }
}