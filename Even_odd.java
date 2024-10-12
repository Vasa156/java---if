//even or odd 

import java.util.Scanner;
   class Even_odd
   {
       public static void main(String args[])
       {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Number : ");
         int num = input.nextInt();
         if(num%2==0)
          {
            System.out.println("The Number is Even");
          }
         else
          {
            System.out.println("The number is Odd");
          }
       }
   }
