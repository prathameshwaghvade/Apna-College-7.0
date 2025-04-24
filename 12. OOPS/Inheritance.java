public class Inheritance {
    public static void main(String[] args) {
        Fish shark  = new Fish();
        shark.eat(); // base class property
        
    }
    
}

// base
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void Breathe(){
        System.out.println("Breathes air");
    }
}

// Derived
class Fish extends Animal{
    int fins;
    
    void swim(){
        System.out.println("Swims in  water");
    }
}
