public class Constructor { 
    public static void main(String[] args) {
        Student s1 = new Student(); // default constr called

        Student s2 = new Student("psw",72); // parametrized const gets called
        System.out.println("Name is: " +s2.name+", Roll no is: "+s2.roll);
        
    }
    
}

class Student{
    String name;
    int roll;
    

    Student() { // Nonparametarized constructor
       System.out.println("Default constructor");
       
    }

    Student(String name , int roll) { // parametarized constructor
        this.name = name;
        this.roll = roll;
       
    }

    
}

// it is also called as constructor overloading
