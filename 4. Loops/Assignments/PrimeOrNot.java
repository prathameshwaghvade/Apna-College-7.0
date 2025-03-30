import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++) { // or we can use i< = math.Sqrt(n) for the larger numbers to minimize the complexity

            if(n%i==0){ // n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
            
        }
        if (isPrime==true) {
            System.out.println("N is prime");
            
        }
        else
        System.out.println("Not prime");

       
    }
    
}
