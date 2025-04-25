public class Increasing_order {
    public static void Fun(int n){
        if(n == 10){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        Fun(n+1);

    }
    public static void main(String[] args) {
        int n =1;
        Fun(n);
        
    }
    
}
