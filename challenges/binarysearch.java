/*
    Write a function that takes in a sorted array of integers as well as a target integer.
    The function should use binary search to determine if the target is contained in the array
*/

import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    int left =0;
    int right = array.length-1;
    
    while(left <= right){
        int mid = (left + right)/2;
        
        if(array[mid] == target){return mid;}
        
        else if(target > array[mid]){
            left = mid +1;
        }
        else{
            right = mid -1;
        }
    }
    return -1;
  }
}
