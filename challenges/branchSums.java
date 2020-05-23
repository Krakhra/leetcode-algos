/* 
    Write a function that takes in a binary tree and returns a list of its branch sums
*/

import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
	
  public static List<Integer> branchSums(BinaryTree root) {
  	List<Integer> list = new ArrayList<>();
    calcSums(root, list,0);
		return list;
  }
	
	public static void calcSums(BinaryTree root, List<Integer> list, int runningSum){
		if(root == null){
			return;
		}
	
		int newSum = runningSum + root.value;
		if(root.right == null && root.left == null){
			list.add(newSum);
		}
		calcSums(root.left, list, newSum);
		calcSums(root.right, list, newSum);
	}
}
