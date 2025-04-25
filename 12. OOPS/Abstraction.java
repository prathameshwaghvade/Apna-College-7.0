public class Abstraction {
    public static void main(String[] args) {
        
        Horse h =new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Bird b = new Bird();
        b.eat();
        b.walk();
        System.out.println(b.color);
    }
    
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    void changeColor(){
        color = "blue";
    }

    void walk(){
        System.out.println("walks on four legs");
    }

}

class Bird extends Animal{

    void changeColor(){
        color = "red";
    }

    void walk(){
        System.out.println("Fly");
    }
}
