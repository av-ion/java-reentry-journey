public class ReverseString {
    public static void main(String[] args) {
        String input = "Javaa";
//       String [] arr =  input.split("");
     String reverse ="";
//       for(int s = arr.length -1;s >=0;s--){
//
//           reverse = reverse + arr[s];

        for(int i=input.length()-1;i>=0;i--){
         reverse +=input.charAt(i);

       }
        System.out.println(reverse);
    }
}
