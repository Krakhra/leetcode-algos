/* 
    Given two non=empty arrays of integers  write a function that determines whether the 
    second array is a valid subsequence of the first one.
*/

import java.util.*;
// O(n) time complexity O(1) Space
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int aidx = 0;
	int sidx = 0;
		
    while(aidx < array.size() && sidx < sequence.size()){
        if(array.get(aidx) == sequence.get(sidx)){
            sidx++;
            aidx++;
        }
        else{
            aidx++;
        }
    }
    if(sidx == sequence.size()){return true;}
    return false;
  }
}