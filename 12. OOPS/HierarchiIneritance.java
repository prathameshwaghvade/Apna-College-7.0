public class HierarchiIneritance {
    public static void main(String[] args) {
      mammels m1 = new mammels();
      m1.eat();
      m1.walk();
      
      fish f = new fish();
      f.eat();
      f.swim();


    }
    
}
// base
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

}

// derived
class mammels extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

// Derived from another derived class 
class fish extends Animal{
    
    void swim(){
        System.out.println("swims");
    }

}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}