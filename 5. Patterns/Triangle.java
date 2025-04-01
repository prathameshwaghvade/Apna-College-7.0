public class Triangle {
    public static void main(String[] args) {

        int row =5; 
        int col = 4; 

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                if(j<=i){
                System.out.print("*");
                }
                
            }
            System.out.println("");
            
        }

        
    }
    
}
