public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 9, 2, 5};
        int target = -9;
        int counter = 0;

        for (int i : numbers){
            if(i == target)
                counter++;
        }
        counter = countOccurrence(numbers,target);
        System.out.println(counter>0?"Target Found":"Target not found");
        System.out.println(target+" appears "+counter+" times");
    }

    public static int countOccurrence(int[] numbers, int target){
        int count = 0;
        for(int i : numbers){
            if(i == target)
                count++;
        }
        return count;
    }
}
