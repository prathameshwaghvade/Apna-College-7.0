//keep entering numbers until user enters a multiple of 10
import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter the numbers: ");
            int n = sc.nextInt();
            if (n%10==0) {
                break;
            }
            System.out.println(n);
            
        } while (true);
}
}
