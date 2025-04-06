import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int marks[] = new int[50];

        System.out.println("Enter Marks of phsyics: ");
        marks[0] = sc.nextInt(); //physics

        System.out.println("Enter Marks of Chemistry: ");
        marks[1] = sc.nextInt(); //chemistry

        System.out.println("Enter Marks of Maths: ");
        marks[2] = sc.nextInt(); //maths

        System.out.println("Marks of phsyics: "+marks[0]);
        System.out.println("Marks of chemistry: "+marks[1]);
        System.out.println("Marks of Maths: "+marks[2]);


        int percentage = (marks[0]+marks[1]+marks[2]) / 3;

        System.out.println("Total percentage is: " +percentage);




        int num []= {1,2,3,4,5};
        System.out.println(num[0]);

       
        System.err.println("The length of the array is: " + num.length);

        
    }
    
}
