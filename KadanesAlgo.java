// subarray max sum
public class KadanesAlgo {
    public static int kadanesAlgoSum(int[] arr){
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i],currentSum + arr[i]);
            maxSum = Math.max(maxSum,currentSum);
            if( currentSum < 0 ){
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
    
    
    public static int bruteForce(int[] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
             int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(sum,maxSum);
            }   
        }
        return maxSum;
    }
    public static void main(String ... args){
     
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        int res = bruteForce(arr);
        int res2 = kadanesAlgoSum(arr);
        System.out.println("Result->BruteForce: " + res);
        System.out.println("Result->KadanesAlgo: " + res2);
    }
}
