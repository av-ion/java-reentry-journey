import java.io.FileNotFoundException;
import java.io.IOException;

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

    public static int getElement(int[] numbers, int index){

        if(index <0 || index>= numbers.length){
            throw  new IllegalArgumentException("Invalid Index");
        }

        return numbers[index];

    }

    public static void loadConfiguration(boolean fileExists) throws IOException {
        if (!fileExists)
            throw new IOException("Configuration file not found.");

        System.out.println("Configuration loaded successfully.");

    }
}
