// subarray max sum
public class KadanesAlgo {
    public static int kadanesAlgoSum(int[] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
             int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum+= arr[j];
            }
            maxSum= Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String ... args){
     
        int[] arr = {5,4,3,2,1,0};
        
        int res = kadanesAlgoSum(arr);
        System.out.print("Result: " + res);
        
        
    }
}