public class TwoSumSortedArray {
public static int[] twoSumSortedArray(int[] nums,int target){
int[] result = new int[2];
int mid;
int l = 0;
int r = nums.length-1;
    for (int i = 0; i < nums.length; i++) {
       int sum = nums[l] + nums[r];
       if(sum == target){
           result[0]  = l+1;

           result[1] = r+1;
           return result;
       }
       else {
           if(sum > target){
               r--;
           }else{
               l++;
           }
       }

    }
return  result;
}
    public static void main(String[] args) {

    int[]  arr = { 1,2,7,11,14};
  int[] result =  twoSumSortedArray(arr,9);
  for(int i : result){
      System.out.print(i+", ");
  }
    }
}
