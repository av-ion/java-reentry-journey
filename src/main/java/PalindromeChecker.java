public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "m";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
            if (text.charAt(i) != text.charAt(j))
                return false;
        }
        return true;
    }

}
