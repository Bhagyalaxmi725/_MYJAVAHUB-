import java.util.*;

class Account {

    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accNo +
                " | Name: " + name +
                " | Balance: " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    accounts.add(new Account(accNo, name, balance));
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    for (Account a : accounts) {
                        if (a.accNo == depAcc) {
                            System.out.print("Enter Amount to Deposit: ");
                            double amount = sc.nextDouble();
                            a.balance += amount;
                            System.out.println("Amount Deposited Successfully!");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int witAcc = sc.nextInt();

                    for (Account a : accounts) {
                        if (a.accNo == witAcc) {

                            System.out.print("Enter Amount to Withdraw: ");
                            double amount = sc.nextDouble();

                            if (a.balance >= amount) {
                                a.balance -= amount;
                                System.out.println("Withdrawal Successful!");
                            } else {
                                System.out.println("Insufficient Balance!");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balAcc = sc.nextInt();

                    for (Account a : accounts) {
                        if (a.accNo == balAcc) {
                            System.out.println("Balance: " + a.balance);
                        }
                    }
                    break;

                case 5:
                    for (Account a : accounts) {
                        a.display();
                    }
                    break;

                case 6:
                    System.out.println("Thank You for Using Banking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}