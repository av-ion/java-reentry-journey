public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 9, 2, 5};
        int target = -9;
        int counter = 0;

        for (int i : numbers){
            if(i == target)
                counter++;
        }
        System.out.println(counter>0?"Target Found":"Target not found");
        System.out.println(target+" appears "+counter+" times");
    }
}
