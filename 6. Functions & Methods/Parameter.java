import java.util.*;
public class Parameter {
    public static int fun(int num1 , int num2) //formal parameters
    {
       
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = fun(a,b); // Actual parameters or arguments
        System.out.println("The sum is: "+add);
        
        
    }
    
}
