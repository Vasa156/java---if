//iIF CONDITION

class ifcon
{
 public static void main(String args[])
 {
  int a,b;
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  System.out.println("IF CONDITION");
  if(a<b)   //----------------------------------if condition
  {
   System.out.println("Print A is Big");
  }
 System.out.println("IFELSE CONDITION");
  if(a>b)  //-------------------------------ifelse condition
  {
   System.out.println("Print A is Big");
  }
  else
  {
   System.out.println("PrintB is Big");
  }
  System.out.println("NESTED IF CONDITION");
  if(a>b)  //----------------------------------ifelseif condition
  {
   System.out.println("Print A is Big");
  }
  else if(b>a)
  {
   System.out.println("Print B is Big");
  }
  else if(a==b)
  {
   System.out.println("A and B is Equal");
  }
 }
}

