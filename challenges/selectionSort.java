/*
    Write a function that takes in an array of integers and returns a sorted version
    of that array using selection sort.
*/

import java.util.*;
//Time Complexiy O(n2) Space  O(1)
class Program {
  public static int[] selectionSort(int[] array) {
    int num_sorted = 0;
		
    while(num_sorted < array.length-1){
        shift(array, num_sorted+1);
        num_sorted++;
    }
    return array;
  }
	
	public static void shift(int[] array, int sorted){
        int i=0;
        while( i < sorted){
            if(array[i] > array[sorted]){
                int temp = array[sorted];
                array[sorted] = array[i];
                array[i] = temp;
            }
            i++;
        }
	}
}
