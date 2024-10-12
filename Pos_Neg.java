 import java.util.Scanner;
 class Pos_Neg
  {
      public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a Number : ");
           int n=input.nextInt();
           if(n>0)
            {
                System.out.println("The Number is Positive");
            }
            else if(n<0)
             {
                 System.out.println("The Number is Negative");
             }
             else
             {
                 System.out.println("The number is Zero");
             }
       }
  }
