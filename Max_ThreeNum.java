//Max 3  numbers

import java.util.Scanner;
class Max_ThreeNum
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter the First Number : ");
          int a=input.nextInt();
          System.out.print("Enter the Second Number : ");
          int b=input.nextInt();
          System.out.print("Enter the Third Number : ");
          int c=input.nextInt();
          if(a>b && a>c)
          {
              System.out.println("The Maxium Number is : "+a);
          }
          else if(b>c && b>a)
          {
              System.out.println("The Maxiumm Number is : "+b);
          }
          else if(c>a && c>b)
          {
              System.out.println("The Maximum Number is : "+c);
          }
          else
          {
              System.out.println("The Numbers are Equal ");
          }
      }
     
 }
 
