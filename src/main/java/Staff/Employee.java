package Staff;

public abstract class Employee {

    private String name;
    private String nino;
    private double salary;

    public Employee(String name, String nino, double salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNino() {
        return nino;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increase) {
        if (increase > 0) {
            return salary += increase;
        }
        return salary;
    }

    public double payBonus() {
        return salary / 100;
    }
}
