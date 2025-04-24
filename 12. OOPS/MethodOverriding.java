public class MethodOverriding {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}

class dog extends Animal{
    void eat(){
        System.out.println("eats food");
    }
}