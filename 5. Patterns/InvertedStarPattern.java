import java.util.*;
public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:-");
        int n = sc.nextInt();
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= n-i+1; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
       
        }
    }
}
