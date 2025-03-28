import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("enter value of a: ");
        int a = sc.nextInt();

        System.out.print("enter value of b: ");
        int b = sc.nextInt();

        System.out.print("enter value of c: ");
        int c = sc.nextInt();

        if (a>b && a> c){
            System.out.println("a is greater than b and c");
        }

        else if (b>a && b>c){
            System.out.println("b is greater than a and c");
        }

        else{
            System.out.println("C is greater than both a and b");
        }
    }
}
