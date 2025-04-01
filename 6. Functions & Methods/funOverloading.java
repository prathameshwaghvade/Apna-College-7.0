// Multiple functions with the same name but diffrent parameters
public class funOverloading {
    public static int sum(int a , int b)
    {
        return a+b;

    }

    public static int sum(int a , int b , int c)
    {
        return a+b+c;

    }
    public static void main(String[] args)
    {
       
        System.out.println("The sum of a and b is: "+sum(5,10));
        System.out.println("The sum of a and b and c is: "+sum(5,10,25));
    }
    
}
