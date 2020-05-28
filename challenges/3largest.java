/*
    Write a function that takes in an array of integers and, without sorting the input
    array, returns a sorted array of the three largest integers in the input array
*/

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int[] lg_vals = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		for(int num : array){
			helper(lg_vals, num);
		}
		return lg_vals;
  }
	public static void helper(int[] lg,int num){
		if(num >= lg[2]){
			lg[0] = lg[1];
			lg[1] = lg[2]; 
			lg[2] = num;
		}
		else if(num >= lg[1]){
			lg[0] = lg[1];
			lg[1] = num;
		}
		else if(num >= lg[0]){
			lg[0] = lg[1];
		}
	}
}
