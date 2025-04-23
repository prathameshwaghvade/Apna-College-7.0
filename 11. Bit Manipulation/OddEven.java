public class OddEven {
    public static void CheckOddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        CheckOddEven(5);
        CheckOddEven(11);
        CheckOddEven(4);
        
    }
    
}
