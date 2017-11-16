import java.lang.*;
import java.io.*;
import java.util.*;

public class Solution {
	// public static int findNum(int[] nums) {
	// 	Arrays.sort(nums);
	// 	int i = 0;
	// 	int j = 1;
	// 	while (j < nums.length - 2) {
	// 		if (nums[i] != nums[j]) {
	// 			i++;
	// 			j++;
	// 			if (nums[i] != nums[j]) {
	// 				return nums[i];
	// 			}
	// 		}
	// 		i++;
	// 		j++;
	// 	}
	// 	if (nums[i] != nums[j]) {
	// 		return nums[j];
	// 	}
	// 	return Integer.MAX_VALUE;
	// }

	public static int findNum(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}	
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return Integer.MAX_VALUE;	
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 4, 4, 1, 3, 2};
		int res = findNum(a);
		System.out.println(res);
	}
}
