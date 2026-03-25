import java.util.Scanner;

// Base class
class Employee {
    int empId;
    String name;
    double salary;

    void getEmployeeData(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayEmployeeData() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}

// Derived class
class Manager extends Employee {
    String department;
    double bonus;

    void getManagerData(String dept, double b) {
        department = dept;
        bonus = b;
    }

    void displayManagerData() {
        displayEmployeeData();
        System.out.println("Department  : " + department);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        m.getEmployeeData(id, name, salary);
        m.getManagerData(dept, bonus);
        m.displayManagerData();

        sc.close();
    }
}
