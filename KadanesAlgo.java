// subarray max sum
public class KadanesAlgo {
    public static int kadanesAlgoSum(int[] arr){
        int maxSum= arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i],currentSum + arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        
        return maxSum;
    }
    
    
    public static int bruteForce(int[] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
             int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
            }
            maxSum= Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String ... args){
     
        int[] arr = {5,4,3,2,1,0};
        
        int res = bruteForce(arr);
        int res2 = kadanesAlgoSum(arr);
        System.out.println("Result->BruteForce: " + res);
        System.out.println("Result->KadanesAlgo: " + res2);
        
        
    }
}
