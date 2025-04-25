public class superKeyword {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.color);
        
        
    }
    
}

class A{
    String color;

    public A() {
        System.out.println("A constructor called");
    }

}

class B extends A{


    public B() {
        super();
        super.color = "brown";
        System.out.println("B constructor called");
    }
    

}