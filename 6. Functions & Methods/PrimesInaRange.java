import java.util.*;
public class PrimesInaRange {
    public static boolean Prime(int n)
    {
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
            
        }
            return true;

    }

    public static int PrimeinRange(int n)
    {
        for (int i = 2; i <= n; i++) {
            if(Prime(i)){
                System.out.print(i+" ");

            }
            
        }
        System.out.println();
        return n;
    }
    public static void main(String[] args) {
        System.out.println(PrimeinRange(20));
        
    }
    
}
