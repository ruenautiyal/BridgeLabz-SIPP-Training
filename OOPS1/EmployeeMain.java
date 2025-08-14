package OOPS1;

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: ₹" + salary);
        System.out.println("-----------------------------");
    }
}

// Main class
public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Rue", 101, 50000);
        Employee emp2 = new Employee("Sakshi", 102, 60000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
