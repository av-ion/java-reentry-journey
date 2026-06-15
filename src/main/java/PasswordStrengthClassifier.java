public class PasswordStrengthClassifier {
    public static void main(String[] args) {
        String password = "";

        String strength = getPasswordStrength(password);

        System.out.println("Password strength: " + strength);

    }
    public static String getPasswordStrength(String password){
        if(password==null || password.isEmpty()) return "Password can't be null/empty";
        if(password.length() >=12) return "Strong";
        if(password.length() >=8) return "Moderate";

        return "Weak";
    }
}
