public class sumOfNnaturalNumbers {
    public static int Calculate(int n){
        if(n==1){
            return 1;
        }

        int summ1 = Calculate(n-1);
        int sum = n + Calculate(n-1);
        return sum;

    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(Calculate(n));
        
    }
    
}
