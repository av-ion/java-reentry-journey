public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "malayalam";
        boolean isPalindrome = true;
        for (int i = 0, j = input.length() - 1; i < input.length() / 2; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println(isPalindrome);
    }

}
