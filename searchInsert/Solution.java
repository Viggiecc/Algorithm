import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {
	public static int searchInsert(int[] A, int target) {
		if (A == null || A.length == 0) return -1;

		int start = 0;
		int end = A.length - 1;
		int mid;

		while (start <= end) {
			mid = start + (end-start)/2;
			if (target > A[mid]) {
				start = mid+1;
			} else if (target < A[mid]) {
				end = mid-1;
			} else {
				return mid;
			}
		}

		return start;
		 // int n = nums.length; 
   //      if(n==0||nums==null)
   //          return -1;
   //      int start = 0;
   //      int end = n-1;
   //      while(start<=end)
   //      {
   //          int mid = start+(end-start)/2;
   //          if(nums[mid]==target)
   //              return mid;
   //          else if(nums[mid]<target)
   //              start = mid+1;
   //          else
   //              end = mid -1;
   //      }
        
   //      return start;
	}

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input target: "); 
		int target = Integer.parseInt(input.nextLine());
		System.out.println("Please give the size of array A: ");
		int number = Integer.parseInt(input.nextLine());
		int[] A = new int[number];
		for (int i = 0; i < number; i++) {
			A[i] = Integer.parseInt(input.nextLine());
		}
		System.out.println("The indexof target will be: " + searchInsert(A, target));
	}
}