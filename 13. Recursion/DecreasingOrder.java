public class DecreasingOrder {
    public static void Fun(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        Fun(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        Fun(n);
        
    }
    
}
