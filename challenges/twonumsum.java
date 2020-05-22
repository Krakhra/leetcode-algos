 /*
    Write a function that takes in a non-empty array of distinct integers and an integer
    represetning a target sum. If any two numbers in the input array sim up to the target sum,
    the function should return them in an array, in any order.
 */

// Solution 1 O(n) Time O(n) Space
 class Solution1 {
  public static int[] twoNumberSum(int[] array, int targetSum) {
  	List<Integer> list = new ArrayList<>();
		int len = array.length;
		
		for(int i =0; i < len; i++){
			int target = targetSum - array[i];
			if(list.contains(target)){
				return new int[] {target, array[i]};
			}
			else{
				list.add(array[i]);
			}
		}
    return new int[0];
  }
}