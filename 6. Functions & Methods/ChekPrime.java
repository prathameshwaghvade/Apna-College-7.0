// Optimized way
import java.util.*;
public class ChekPrime
{
    public static boolean Prime(int n){
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
            
        }
            return true;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(Prime(n));
        
    }
    
}
