public class Swap {
    public static void swapVariable(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: "+a+" B: "+b);

    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        swapVariable(a, b);

    }
    
}
