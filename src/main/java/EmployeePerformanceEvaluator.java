public class EmployeePerformanceEvaluator {
    public static void main(String[] args) {
        int completedTasks = -0;

        String performance = evaluatePerformance(completedTasks);

        System.out.println("Performance Rating: " + performance);
    }

    public static String evaluatePerformance(int completedTasks) {
        if (completedTasks >= 20) return "Excellent";
        if (completedTasks >= 15) return "Good";
        if (completedTasks >= 10) return "Average";
        if (completedTasks >= 1) return "Needs Improvement";
        if (completedTasks == 0) return "No tasks completed";

        return "Invalid Input";

    }
}
