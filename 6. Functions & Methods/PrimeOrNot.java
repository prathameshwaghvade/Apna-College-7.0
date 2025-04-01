// This is a one way not so optimized
import java.util.*;
public class PrimeOrNot {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 1; i <= n; i++) {
            if(n%2==0){
                isPrime=false;
                break;
            }
            
        }
        return isPrime;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        
    }
    
}
