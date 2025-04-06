public class ReverseAnArray
{
    public static void Reverse(int arr[])
    {
        int start = 0;
        int end = arr.length-1 ;

        while(start<end){
            int temp = arr[end];
            arr[end] = arr [start];
            arr[start] = temp;

            start ++;
            end--;

        }

    }
    public static void main(String[] args)
    {
        int arr [] = {2,4,6,8,10};
        Reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numbers of array: " + arr[i]);
            
        }
        System.out.println();
    }
    
}
