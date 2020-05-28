/*
    Write a function that takes in a special array returns its product sum.
    array = [5,2,[7,-1],3,[6,[-13,8],4]]
    Output is 12, 5 + 2 + 2 * (7-1) +3 + 2 * (6 + 3 * (-13 + 8)+4)
*/

import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return calcSum(array, 1); 
  }
	
	public static int calcSum(List<Object> array, int level){
		int sum =0;
		
		for(Object node: array){
			if(node instanceof ArrayList){
				sum += calcSum((ArrayList)node, level+1);
			}
			else{
				sum += (int)node;
			}
		}
		
		return sum*level;
	}
}
