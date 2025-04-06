
// Time complexity = O(n)
public class LinearSearch
{
    public static int SearchNum(int arr[] , int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 60){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[] args)
    {
        
        int arr [] = {10,20,30,40,50,60,70,80,90,100};
        int key = 60;
        int index = SearchNum(arr, key);

        if(index == -1)
        {
            System.out.println("Not found");
        }

        else
        {

            System.out.println("Key is at index : " + index);

        }

       
    }
    
}
