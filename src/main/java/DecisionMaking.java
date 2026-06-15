public class DecisionMaking {
    public static void main(String[] args) {
        int age = 16;

        if (isEligibleToVote(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        String password = "Secure123";
        if(isValidPassword(password)){
            System.out.println("Password accepted");
        } else {
            System.out.println("Password too short");
        }
        String username = "javaDev123478954";

        if (isValidUsername(username)) {
            System.out.println("Username accepted");
        } else {
            System.out.println("Invalid username");
        }

        username = "javaDev";
        password = "Secure123";
        age = 25;

        if(canRegister(username,password,age)){
            System.out.println("Registration allowed");
        }
        else{
            System.out.println("Registration not allowed");
        }

    }

    public static boolean isEligibleToVote(int age){
        return age >= 18;
    }

    public static boolean isValidPassword(String password){
        return password.length()>=8;
    }

    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.length() <= 15;
    }

    public static boolean canRegister(String username, String password, int age){
        return isValidPassword(password) && isValidUsername(username) && isEligibleToVote(age);
    }
}
