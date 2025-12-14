class Employee {
    String name;
    int id;
    double basicSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class Report1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ayrin", 101, 35000.0);
        Manager m1 = new Manager("Siam", 201, 55000.0, "Operations");

        System.out.println("Employee Details");
        e1.displayInfo();

        System.out.println(" Manager Details");
        m1.displayInfo();
    }
}