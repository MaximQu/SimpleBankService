package employee;

public class Main {
    public static void main(String[] args) {
        Employee biba = new SalariedEmployee("Biba", 60000);
        Employee boba = new HourlyEmployee("Boba", 20, 160);

        System.out.println(biba.name + "'s Salary: $" + biba.getSalary());
        System.out.println(boba.name + "'s Salary: $" + boba.getSalary());
    }
}
