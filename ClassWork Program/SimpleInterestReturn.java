import java.util.Scanner;   // Import Scanner class

class SimpleInterestReturn {

    // Method to calculate simple interest
    // This method returns a float value
    static float calculateSI(float p, float r, float t) {
        return (p * r * t) / 100;   // Return calculated SI
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Take principal amount from user
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();

        // Take rate of interest from user
        System.out.print("Enter Rate: ");
        float r = sc.nextFloat();

        // Take time period from user
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();

        // Call method and store returned value
        float si = calculateSI(p, r, t);

        // Print simple interest
        System.out.println("Simple Interest = " + si);
    }
}
