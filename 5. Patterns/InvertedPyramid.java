// Inverted and rotated half pyramid
public class InvertedPyramid {
    public static void Pyramid(int row , int col)
    {
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= row-i; j++)
            {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        Pyramid(4, 4);
        
    }
    
}
