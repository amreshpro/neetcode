import java.util.HashMap;


public class AnagramAlgo {
    
    public static boolean isAnagram(String s1,String t1){
        boolean result = false;
      
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
          map.put(ch,map.getOrDefault(map.get(ch),0)+1);
        }
        for(char c : t1.toCharArray()){
            if(map.get(c) == 0){
                result = false;
                break;
            }else{
              result= true ;
            }
          
        }
        return result;
    }
    
    public static void main(String ...args){
        String s= "listen";
        String t= "stenlit";
        System.out.println("isAnagram: " + isAnagram(s,t));
    }
}