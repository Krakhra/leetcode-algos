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
      System.out.println(entry.getKey() + ", " + entry.getValue());
      // if(entry.getValue() == 0){
      //   return index;
      // }
      index++;
    }

    return -1;
  }

  public static void main(String args[]){
    String test = "LoveLeetCode";
    int out = unique(test);
    System.out.println(out);
  }
}