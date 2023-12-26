package frontend;

import entity.EmployeeCommon;

public class ProgramEmp {

    public static void main(String[] args) {
        // a) Tạo chương trình demo với Employee có salaries là kiểu int
        EmployeeCommon employeeInt = new EmployeeCommon(1, "Employee1", new Integer[]{1000, 1200, 1300});
        System.out.println("Employee with int salaries:");
        printEmployeeInfo(employeeInt);
        printLastMonthSalary(employeeInt);

        // b) Tạo chương trình demo với Employee có salaries là kiểu float
        EmployeeCommon employeeFloat = new EmployeeCommon(2, "Employee2", new Float[]{1500.5f, 1600.75f, 1700.25f});
        System.out.println("Employee with float salaries:");
        printEmployeeInfo(employeeFloat);
        printLastMonthSalary(employeeFloat);

        // c) Tạo chương trình demo với Employee có salaries là kiểu double
        EmployeeCommon employeeDouble = new EmployeeCommon(3, "Employee3", new Double[]{2000.0, 2100.0, 2200.0});
        System.out.println("Employee with double salaries:");
        printEmployeeInfo(employeeDouble);
        printLastMonthSalary(employeeDouble);
    }

    private static void printEmployeeInfo(EmployeeCommon employee) {
        System.out.println("Employee Info:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salaries: " + salariesToString(employee.getSalaries()));
    }

    private static void printLastMonthSalary(EmployeeCommon employee) {
        Number[] salaries = employee.getSalaries();
        int lastIdx = salaries.length - 1;
        System.out.println("Last Month Salary: " + salaries[lastIdx]);
    }

    private static String salariesToString(Number[] salaries) {
        StringBuilder sb = new StringBuilder();
        for (Number salary : salaries) {
            sb.append(salary).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Xóa dấu phẩy và khoảng trắng ở cuối
        return sb.toString();
    }
}