//Break:- To exit the loop
//Continue:- To skip iteration
public class breakContinue {
    public static void main(String[] args) {
        
        for (int i = 1; i < 10; i++) {
            if (i==5) {
                break;
            }
            else if (i==3) {
                continue;
                
            }
            System.err.println(i);
        }
        System.out.println("Out of the loop");
    }
    
}
