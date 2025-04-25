public class Fibonacci {
    public static int Fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int fbnm1= Fib(n-1);
        int fbnm2= Fib(n-2);

        int fn = fbnm1+fbnm2;
        return fn;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fib(n));
        
    }
    
}
