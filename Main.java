// Interface for Printable
interface Printable {
    void displayInfo();
}

// Class for Employee
class Employee implements Printable {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
    }
}

// Subclass for Manager (Inherits from Employee)
class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + getDepartment());
    }
}

// Subclass for Developer (Inherits from Employee)
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + getProgrammingLanguage());
    }
}

public class Main {
    // Polymorphism: Method that accepts Printable objects
    public static void printEmployeeInfo(Printable printable) {
        printable.displayInfo();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30, 50000);
        Manager manager1 = new Manager("Jane Smith", 40, 70000, "HR");
        Developer developer1 = new Developer("Tom Brown", 25, 60000, "Java");

        // Using encapsulation to access attributes
        System.out.println(emp1.getName());
        System.out.println(manager1.getDepartment());
        System.out.println(developer1.getProgrammingLanguage());

        // Using polymorphism to print employee info
        printEmployeeInfo(emp1);
        printEmployeeInfo(manager1);
        printEmployeeInfo(developer1);
    }
}
