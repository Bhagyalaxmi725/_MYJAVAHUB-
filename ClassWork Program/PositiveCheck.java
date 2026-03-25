import java.util.Scanner;   // Import Scanner class

class PositiveCheck {

    // Method to check whether number is positive or not
    static void checkPositive(int num) {
        if (num > 0) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Not Positive");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Accept number from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the method
        checkPositive(n);
    }
}
