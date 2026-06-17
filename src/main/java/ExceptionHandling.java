public class ExceptionHandling {
    public static void main(String[] args) {
        processAge("-25");
    }
    public static int divide(int dividend, int divisor){

        if(divisor == 0) throw new IllegalArgumentException("Divisor cannot be zero");

        return dividend/divisor;
    }

    public static void processAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            if (age > 0)
                System.out.println("Valid age :" + age);
            else
                throw new IllegalArgumentException("Age cant be negative");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Age format");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processing complete");
        }
    }
}
