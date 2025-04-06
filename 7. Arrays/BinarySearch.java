// Sorted arrays divide and conquer approach
// Time complexity = O(logn)
public class BinarySearch

{
    public static int BS(int arr[] , int key)
    {
     int start = 0;
     int end = arr.length - 1;

     while(start<=end)
     {
        int mid = (start+end) / 2;

        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] < key){
            start = mid + 1;
        }

        else{
            end = mid - 1;
        }

     }
     return -1;
    }
    public static void main(String[] args)
    {
        int arr [] = {2,4,6,8,10,12,14,16,18,20};
        int key  = 10;

        System.out.println("Index for key 10 is: " + BS(arr, key));

    }
    
}
