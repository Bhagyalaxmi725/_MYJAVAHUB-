
class Account{
double balance;

void showBalance(){

System.out.println("Balance: " + balance);
}
}

class SavingsAccount extends Account{

double interestRate;

void showinterest(){
System.out.println("Interest: " + interestRate);
}

}

class CurrentAccount extends Account{

double overdraftlimit;
void showoverdraft(){
System.out.println("OverDraft Limit: " + overdraftlimit);
}

}

public class HierarchicalInheritance{
public static void main(String[] args){

SavingsAccount sa= new SavingsAccount();
sa.balance=50000;
sa.interestRate=4.5;

sa.showBalance();
sa.showinterest();

CurrentAccount ca=new CurrentAccount();
ca.balance=60000;
ca.overdraftlimit=10000;

ca.showBalance();
ca.showoverdraft();

}
}
