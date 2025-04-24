public class CopyConstructor { 
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prathamesh";
        s1.roll = 36;
        s1.pass="newpass";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

       

        Student s2 = new Student(s1);
        s2.pass = "gjhbsd";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }
       
        
    }
    
}

class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    

    Student(Student s1) { // Nonparametarized constructor
      marks = new int[3];
        this.name = s1.name;
        this.roll=s1.roll;
        this.marks = s1.marks;
      
       
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    


    
}

// it is also called as constructor overloading
