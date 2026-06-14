public class MaxDifference {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 14, 5, 1};
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);
        int difference = largest - smallest;
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        System.out.println("Difference: "+difference);

    }
    public static int findSmallest(int[] numbers){

        if(numbers.length==0){
            System.out.println("Array is empty");
            return -1;
        }
        int smallest = numbers[0];
        for(int i =1 ;i<numbers.length;i++){
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int findLargest(int[] numbers){

        if(numbers.length==0){
            System.out.println("Array is empty");
            return -1;
        }
        int largest = numbers[0];
        for(int i =1 ;i<numbers.length;i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
