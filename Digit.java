import java.util.*;
class Digit
{
  public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter any number");
       int n=sc.nextInt();
       int count=0;
       for(int i=0;i<n;i++)
       {
            n=n/10;
            count++;
        }
        System.out.println("enter number of digits"+count);
    }
}