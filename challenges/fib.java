/*
    The Fibonacci sequence is defined as follows: the first number of the sequence is 0, the
    second number is 1, and the nth number is the sum of n-1 and n-2.                   
*/

import java.util.*;

class Program {
  public static int getNthFib(int n) {
		if(n == 1){return 0;}
		if(n == 2){return 1;}
		
    List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		int i=3;
		int current=0;
		
		while(i <= n){
			current = list.get(0) + list.get(1);
			list.set(0,list.get(1));
			list.set(1,current);
			i++;
		}
		
    return current;
  }
}
