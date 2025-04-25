public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prathamesh";
        System.out.println(s1.name);
        s1.SchoolName = "DYP"; // This is static value for all the objects that have created it will not be chnaged for other objects

        Student s2 = new Student();
        s2.name = "pratham";
        System.out.println(s2.name);
        s2.SchoolName = "DYP";
        System.out.println(s2.SchoolName);

         
    }
}

class Student{
    String name;
    int roll;
    static String SchoolName;

    void setName(String name){ 
        this.name = name;

    }

    String getName(){
        return this.name;
    }
}


