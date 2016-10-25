import java.lang.*;
import java.io.*;
import java.util.*;

public class Solution {
	public static int strStr (String source, String target) {
		int sourceLen = source.length();
		int targetLen = target.length();
		if(source == null || target == null || targetLen > sourceLen) {
			return -1;
		}

		int i;
		int j;
		for (i = 0; i < sourceLen - targetLen +1; i++) {
			for (j = 0; j < targetLen; j++) {
				if (source.charAt(i + j) != target.charAt(j)) {
					break;
				}		
			}
			if (j == targetLen) return i;
		}
		return -1;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("String source: ");
		String source = input.nextLine();
		System.out.println("String target: ");
		String target = input.nextLine();
		// Solution solution = new Solution();
		// System.out.println(solution.strStr(source, target));

		System.out.println("The index is: " + strStr(source, target));
	}
}