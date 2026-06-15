public class Overloading {
    public static void main(String[] args) {
        System.out.println(findLargest(10, 20));
        System.out.println(findLargest(10, 20, 15));
        System.out.println(calculateArea(5.0));
        System.out.println(calculateArea(5.0, 4.0));
        System.out.println(calculateArea(5.0, 4.0, true));

    }

    public static int findLargest(int a, int b) {
        return a > b ? a : b;
    }

    public static int findLargest(int a, int b, int c) {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    public static boolean isValid(double num) {
        return num >= 0;
    }

    public static double calculateArea(double length, double width) {
        if (isValid(length) && isValid(width)) {
            return length * width;
        }
        return -1;

    }

    public static double calculateArea(double side) {
        if (isValid(side))
            return side * side;

        return -1;
    }

    public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isValid(base) && isValid(height))
            return base * height / 2;
        return -1;
    }

    public static String greet(){
        return "hello";
    }
    public static String greet(String name){
        return "hello,"+name;
    }
    public static String greet(String name, String timeOfDay){
        return "good "+timeOfDay+", "+name;
    }

}
