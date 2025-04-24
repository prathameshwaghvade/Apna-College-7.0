public class MethodOverloading {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.sum(10, 20));
        System.out.println(c.sum(10, 20, 30));
        
    }
    
}

class calculator{
    int sum (int a , int b){
      int sum = a+b;
        return sum;
    }

    int sum (int a , int b , int c){
        int sum = a+b+c;
          return sum;
      }
}
