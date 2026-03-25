import java.util.*;

class Electricitybill{


void Checkunits()
{
     double total_bill;

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number of units consumed: ");
     double value = sc.nextDouble();


     if(value<=100)
     { 
       total_bill=value*1.50;
       System.out.println("The Total bill is: "+total_bill);
             
     }

     else if(value<=200)
     {
       total_bill=100*1.50+(value-100)*2.50;
       System.out.println("The Total bill is: "+total_bill);

     }
  
     else if(value<=300)
     {
       total_bill=100*1.50+100*2.50+(value-200)*4.0;
       System.out.println("The Total bill is: "+total_bill);

     }

     else
     {
       total_bill=100*1.50+100*2.50+100*4.0+(value-300)*6.0;
       System.out.println("The Total bill is: "+total_bill);

     }
}

public static void main(String[] args)

{
    
    Electricitybill obj=new Electricitybill();
    obj.Checkunits();

}
      
}