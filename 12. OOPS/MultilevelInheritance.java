public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.legs=4;

        System.out.println(d.legs);
        
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

// derived
class mammels extends Animal{
    int legs;
}

// Derived from another derived class 
class Dog extends mammels{
    String breed;

}