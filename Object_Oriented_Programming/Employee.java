package Object_Oriented_Programming;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rue Nautiyal", 1555, 100000);
        emp1.displayDetails();
    }
}
