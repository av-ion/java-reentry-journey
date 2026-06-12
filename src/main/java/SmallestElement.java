public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {44,77,12,4,87};
        int smallest = numbers[0];

        for(int i = 1;i < numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("Smallest number is "+smallest);
    }
}
