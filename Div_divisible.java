//dividend and divisible number using if

import java.util.Scanner;
  class Div_divisble
   {
       public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Dividend Number : ");
            int dividend = input.nextInt();
            System.out.print("Enter the Divisble Number : ");
            int divisble = input.nextInt();
            if(dividend % divisble == 0)
            {
                System.out.println("The Number is divisble");
            }
            else 
            {
                System.out.println("The number is not divisble");
            }
        }
   }
