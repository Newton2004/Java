//Sum of two numbers
import java.util.*;
public class basic
{
    public static void main(String[] a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result = num1+num2;
        System.out.println("Total = " +result);    
        sc.close();
}
}