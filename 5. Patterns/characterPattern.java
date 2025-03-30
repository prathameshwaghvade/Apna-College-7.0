import java.util.Scanner;
public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            
        }
        
    }
    
}
 