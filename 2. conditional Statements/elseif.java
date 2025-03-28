
public class elseif {
    public static void main(String[] args) {
        
        int age = 30;

        if (age>18){
            System.out.println("Adult");
        }

        else if(age<18 && age >13){
            System.out.println("Teenage");
        }

        else{
            System.out.println("Child");
        }
    }
}
