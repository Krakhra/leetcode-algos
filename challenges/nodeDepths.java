import java.util.*;

class Program {

  public static int nodeDepths(BinaryTree root) {
		int sum = 0;
		Stack<StackNode> stack = new Stack<>();
		StackNode node = new StackNode(0,root);
		stack.push(node);
		
		while(stack.size() > 0){
			StackNode temp = stack.pop();
			BinaryTree b = temp.node;
			int d = temp.depth;
			
			if(b == null){continue;}
			
			sum += d;
			stack.add(new StackNode(d+1, b.left));
			stack.add(new StackNode(d+1, b.right));
		}
		
		return sum;
  }
	
  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
	
    static class StackNode {
        int depth;
        BinaryTree node;
        
        public StackNode(int val, BinaryTree object){
            this.depth = val;
            this.node = object;
        }
    }
}
