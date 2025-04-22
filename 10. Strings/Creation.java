import java.util.*;
public class Creation {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        String name;
        String surname;
        name = ac.nextLine();
        surname = ac.nextLine();
        System.out.println("name is: " + name);
        System.out.println("Length of the string is :" + name.length()); // length func
        System.out.println("Concat is : "+ name+ ""  +surname); // Concat
    }
    
}
