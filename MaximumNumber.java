// Write a program to find maximum between two numbers

import java.util.Scanner;
class MaximumNumber
{
    public static void main(String args[])
      {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Number : ");
        int number1 = input.nextInt();
        System.out.print("Enter a Second Number : ");
        int number2 = input.nextInt();
        if(number1>number2)
         {
             System.out.println("The Maximum Number is : "+number1);
         }
         else if(number1<number2)
         {
             System.out.println("The Maxium Number is : "+number2);
         }
         else
         {
             System.out.println("the number is equal : "+number1);
         }
      }
}


