import java.util.*;
public class fdProduct {
    public static int multiply(int a, int b){
        int mul = a*b;
        System.out.println("The product of a and b is: "+mul);
        return mul;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a =sc.nextInt();
        System.out.println("EnteSr the value of b: ");
        int b =sc.nextInt();
        multiply(a,b);
        
    }
    
}
