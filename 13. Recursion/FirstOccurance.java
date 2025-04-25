public class FirstOccurance {
    public static int occurance(int arr[], int key , int i){
       
       if(i==arr.length){
        return -1;
       }

        if(arr[i] == key){
            return i;
        }

       return  occurance(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {3,24,2,16,3,1};
        System.out.println(occurance(arr, 3, 0));
        
    }
    
}
