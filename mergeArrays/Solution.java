import java.lang.*;
import java.util.*;
import java.io.*;

public class Solution {
	public static int[] mergeArrays(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] res = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0; 
		while (i < m && j < n) {
			if (a[i] < b [j]) {
				res[k++] = a[i++];
			} else {
				res[k++] = b[j++];
			}
		}
		while (i < m) {
			res[k++] = a[i++];
		}
		while (j < n) {
			res[k++] = b[j++];
		}
		return res;
	}

	public static void main (String[] args) {
		int[] a = {1, 2, 5, 7};
		int[] b = {3, 3, 6, 8, 9};
		int[] res = mergeArrays(a, b);
		System.out.println(Arrays.toString(res));
	}
}