import java.util.HashSet;
public class ContainDuplicate {
    
    
    public static boolean isContainDuplicate(int[] arr){
        boolean res = false;
        HashSet<Integer> set =  new HashSet<>();
        for(int i : arr){
            
            if(!set.add(i)){
                res= true;
                break;
            }
        }
        return res;
    }
    
    
    public static void main(String...args)
    {
        int arr[] = {1,2,3};
        System.out.println(isContainDuplicate(arr));
    }
    
    
}