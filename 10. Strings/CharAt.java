import java.util.Scanner;

public class CharAt {
    public static void printLetters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
            
        }
        
    }
     public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        String name;
        name = ac.nextLine();
      
        System.out.println(name.charAt(2));

        printLetters(name);
    }
    
    
}
