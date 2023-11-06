package entity;

public class EmployeeCommon {
    private int id;
    private String name;
    private Number[] salaries;

    public EmployeeCommon(int id, String name, Number[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Number[] getSalaries() {
        return salaries;
    }
}