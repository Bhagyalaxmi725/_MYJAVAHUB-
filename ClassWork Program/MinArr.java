//WAP TO FIND MINIMUM OF GIVEN NUMBER

import java.util.Scanner;

class MinArr
{
    public static void main(String args[])
    {
        int i,min;
        int arr[]=new int[5];                                           
        Scanner sc=new Scanner(System.in);

      
        System.out.println("Enter five values:");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        System.out.println("------Minimum Number------");
     
        for(i=0;i<5;i++)
        {
            if(arr[i]<min)
            {
              System.out.println(min);       //how many times it is getting swapped
              min=arr[i];
            }
            
        }

        
        System.out.println("Minimum Number is: "+min);
      }
}