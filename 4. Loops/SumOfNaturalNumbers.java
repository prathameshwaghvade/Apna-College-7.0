import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("enter n: ");
        int n= sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("sum is: "+sum);
    }
    
}
