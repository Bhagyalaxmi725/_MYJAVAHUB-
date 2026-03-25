
import java.util.Scanner;

// Class for Rectangle
class Rectangle 
{
    int length, breadth;
    int area;

    // Method to take input
    void getData() 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length: ");
        length=sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth=sc.nextInt();
    }

    // Method to calculate area
    void calculateArea() 
    {
        area=length*breadth;
    }

    // Method to display area
    void display() 
    {
        System.out.println("Area of Rectangle: " + area);
    }
}

public class AreaRectangleObj
{
    public static void main(String[] args)
    {

        // Creating object of Rectangle class
        Rectangle r=new Rectangle();

        // Calling methods
        r.getData();
        r.calculateArea();
        r.display();
    }
}
