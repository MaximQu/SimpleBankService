package employee;

public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
