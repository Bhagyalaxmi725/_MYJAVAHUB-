
import java.util.Scanner;

// Class for Employee details
class Employee 
{
    int empId;
    String empName;
    double salary;

    // Method to take input
    void getData() 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId=sc.nextInt();

        System.out.print("Enter Employee Name: ");
        empName=sc.next();

        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
    }

    // Method to display details
    void display() 
    {
        System.out.println("------OUTPUT------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmpDetails 
{
    public static void main(String[] args)
    {

        // Object creation
        Employee e=new Employee();

        // Calling methods
        e.getData();
        e.display();
    }
}
