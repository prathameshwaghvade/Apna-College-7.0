public class ArrayasArgument {
    public static void update(int marks[])
    {
        for (int i = 0; i < marks.length; i++)
        {
            marks[i] = marks[i] +1;
            
        }
        
    }
    public static void main(String[] args) {
        int marks [] = {90,92,82};

        update(marks);

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]+ "");
            
        }

        System.out.println("");
    }

    
}
