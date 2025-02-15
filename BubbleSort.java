
public class BubbleSort {
   public static int[] bubbleSort(int[] arr){
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr.length-1 ; j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]= temp;
               }
           }
       } 
       return arr;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int[] result1 = bubbleSort(arr);
        for(int i : result1){
            System.out.print(i+", ");
        }
        
        
        
    }
    
}
