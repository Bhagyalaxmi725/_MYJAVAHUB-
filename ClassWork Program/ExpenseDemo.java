
import java.util.Scanner;

// Class to calculate monthly expenses
class MonthlyExpense 
{
    double rent, food, transport, electricity;

    // Method to accept expense details
    void acceptExpenses(double r, double f, double t, double e) 
    {
        rent=r;
        food=f;
        transport=t;
        electricity=e;
    }

    // Method to calculate total expense
    double calculateTotal()
    {
        return rent + food + transport + electricity;
    }
}

// Main class
public class ExpenseDemo 
{
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);

        MonthlyExpense exp=new MonthlyExpense();

        // Taking input from user
        System.out.print("Enter Rent Expense: ");
        double rent=sc.nextDouble();

        System.out.print("Enter Food Expense: ");
        double food=sc.nextDouble();

        System.out.print("Enter Transport Expense: ");
        double transport=sc.nextDouble();

        System.out.print("Enter Electricity Expense: ");
        double electricity=sc.nextDouble();

        // Setting expenses
        exp.acceptExpenses(rent, food, transport, electricity);

        // Displaying total expense
        System.out.println("\nTotal Monthly Expense = " + exp.calculateTotal());

        sc.close();
    }
}
