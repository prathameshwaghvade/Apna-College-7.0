import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of selements:");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

        for(int i=1;i<=n;i++){

            int x = sc.nextInt();
            if(x%2==0){
                even+=x;
            }

            else{
                odd+=x;
            }
        }

        System.out.println("sum of even elements: "+even);
        System.out.println("sum of even odd: "+odd);
    }
}
