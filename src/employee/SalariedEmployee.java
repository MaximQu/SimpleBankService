package employee;

public class SalariedEmployee extends Employee {
    private final double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double getSalary() {
        return salary / 12;
    }
}
