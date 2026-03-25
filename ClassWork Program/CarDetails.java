
import java.util.Scanner;

// Class for Car details
class Car 
{
    String brandName;
    String model;
    int cost;

    // Method to take input
    void getData() 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Brand Name: ");
        brandName=sc.next();

        System.out.print("Enter Model: ");
        model=sc.next();

        System.out.print("Enter Cost: ");
        cost=sc.nextInt();
    }

    // Method to display data
    void display()
    {
        System.out.println("------OUTPUT------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Cost: " + cost);
    }
}

public class CarDetails {
    public static void main(String[] args) {

        // Object creation
        Car c=new Car();

        // Calling methods
        c.getData();
        c.display();
    }
}
