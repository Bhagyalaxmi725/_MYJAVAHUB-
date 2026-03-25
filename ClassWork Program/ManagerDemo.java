
import java.util.Scanner;

// Base class
class Employee 
{
    int empId;
    String name;
    double salary;

    // Method to accept employee details
    void acceptEmployeeDetails(int id, String n, double sal) 
    {
        empId = id;
        name = n;
        salary = sal;
    }

    // Method to display employee details
    void displayEmployeeDetails() 
    {
        System.out.println("Employee ID: " +empId);
        System.out.println("Name: " +name);
        System.out.println("Salary: " +salary);
    }
}

// Derived class
class Manager extends Employee 
{
    String department;
    double bonus;

    // Method to accept manager details
    void acceptManagerDetails(String dept, double b) 
    {
        department=dept;
        bonus=b;
    }

    // Method to display manager details
    void displayManagerDetails() 
    {
        displayEmployeeDetails(); // calling base class method
        System.out.println("Department: " +department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

// Main class
public class ManagerDemo 
{
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);

        Manager m=new Manager();

        // Taking input from user
        System.out.print("Enter Employee ID: ");
        int id=sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary=sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept=sc.nextLine();

        System.out.print("Enter Bonus: ");
        double bonus=sc.nextDouble();

        // Setting values
        m.acceptEmployeeDetails(id, name, salary);
        m.acceptManagerDetails(dept, bonus);

        // Displaying details
        System.out.println("\n--- Manager Details ---");
        m.displayManagerDetails();

        sc.close();
    }
}
