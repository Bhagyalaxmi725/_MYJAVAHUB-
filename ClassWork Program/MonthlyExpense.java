import java.util.Scanner;

class MonthlyExpense {
    double rent, food, travel, electricity, total;

    void getExpenses(double r, double f, double t, double e) {
        rent = r;
        food = f;
        travel = t;
        electricity = e;
    }

    void calculateTotal() {
        total = rent + food + travel + electricity;
    }

    void displayExpense() {
        System.out.println("Monthly Expense Details");
        System.out.println("Rent        : " + rent);
        System.out.println("Food        : " + food);
        System.out.println("Travel      : " + travel);
        System.out.println("Electricity : " + electricity);
        System.out.println("Total       : " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthlyExpense m = new MonthlyExpense();

        System.out.print("Enter Rent: ");
        double rent = sc.nextDouble();

        System.out.print("Enter Food Expense: ");
        double food = sc.nextDouble();

        System.out.print("Enter Travel Expense: ");
        double travel = sc.nextDouble();

        System.out.print("Enter Electricity Bill: ");
        double electricity = sc.nextDouble();

        m.getExpenses(rent, food, travel, electricity);
        m.calculateTotal();
        m.displayExpense();

        sc.close();
    }
}
