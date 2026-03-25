//WAP TO FIND MAXIMUM OF GIVEN NUMBER

import java.util.Scanner;

class MaxArr
{
    public static void main(String args[])
    {
        int i,max;
        int arr[]=new int[5];                                           
        Scanner sc=new Scanner(System.in);

      
        System.out.println("Enter five values:");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        System.out.println("------Maximum Number------");
     
        for(i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
              max=arr[i];
            }
        }

        
        System.out.println("Maximum Number is: "+max);
      }
}