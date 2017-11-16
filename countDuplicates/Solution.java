import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static int countDuplicates(int[] A) {
		int count = 0;
		if (A == null || A.length == 0) {
			return count;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) > 1) 
				count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,3,4,4,5,6,6,6,6,7,7};
		int count = countDuplicates(A);
		System.out.println(count);
	}
}