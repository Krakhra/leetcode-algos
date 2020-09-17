/*
    Find Closest Value In BST
    Write a function that takes in a binary search tree and a target integer value and returns
    the closest value to the target in the bst
 */

// Average: Time complexity is O(log(n)) Space O(log(n))
//Worst: Time O(n) Space O(n) - when tree is linear 
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBst(tree, target, Integer.MAX_VALUE);
  }
	
	public static int findClosestValueInBst(BST tree, int target, int closest){
		
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
