public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 3;

        String grade = calculateGrade(marks);

        System.out.println("Grade: " + grade);

    }

    public static String calculateGrade(int marks){

        if (marks >100 || marks <0) return "Invalid Marks";
        if(marks >=90) return "A";
        if(marks >=80) return "B";
        if(marks >=70) return "C";
        if(marks >=60) return "D";

        return "F";


    }
}
