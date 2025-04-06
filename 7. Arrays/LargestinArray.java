import java.util.*;
public class LargestinArray {
    public static int GetLargest(int arr []){
        int largest = Integer.MIN_VALUE; // - infinity
        
        for (int i = 0; i < arr.length; i++)
        {
            if(largest < arr[i]){
                largest = arr[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {

        int arr [] = { 1,2,6,3,5};
        System.out.println("Largest number in an array is: " + GetLargest(arr));
        
    }
    
}
