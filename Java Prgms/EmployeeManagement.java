class Employee {
    protected String name, role;
    protected double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, "Manager", salary);
    }
}

class Staff extends Employee {
    public Staff(String name, double salary) {
        super(name, "Staff", salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        Employee staff = new Staff("Bob", 40000);

        manager.displayDetails();
        staff.displayDetails();
    }
}
