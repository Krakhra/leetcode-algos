import java.util.HashMap;
import java.util.Map;
import static java.lang.System.*;


public class first_unique_character{

  public static int unique(String s){
    HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
    int len = s.length();

    //initialize map
    for(int i=0; i < len-1;i++){
      if(hmap.containsKey(s.charAt(i))){
        hmap.replace(s.charAt(i),1);
      }
      else{
        hmap.put(s.charAt(i),0);
      }
    }

    //iterate map
    int index =0;
    for(Map.Entry<Character, Integer> entry : hmap.entrySet()){
      if(hmap.)
    }

    return 0;
  }

  public static void main(String args[]){
    String test = "LeetCode";
    unique(test);
  }
}