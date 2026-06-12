public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name,double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Id = "+getEmployeeId()+"\nEmployee Name = "+getName()+"\nSalary = "+getSalary()+"\n");

    }

    public void giveRaise(double percentage){
        setSalary((salary * (1 + percentage / 100)));

    }

    public static void main(String[] args) {
        Employee arun = new Employee(101,"Arun",12000);
        Employee bala = new Employee(102,"bala",9000);
        arun.displayEmployeeDetails();
        bala.displayEmployeeDetails();

        bala.giveRaise(10);

        arun.displayEmployeeDetails();
        bala.displayEmployeeDetails();
    }
}
