import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {

	public static String stringCompression(String s) {
		if (s.length() == 0 || s.length() == 1) return s;
		StringBuilder res = new StringBuilder();
		int i = 1;
		int count = 1;
		while(i < s.length()) {
			if (s.charAt(i-1) == s.charAt(i)) {
				count++;
				if (i == s.length()-1) {
					res.append(s.charAt(i));
					if (count >1) res.append(count);
				}
			} else {
				res.append(s.charAt(i-1));
				if (count > 1) res.append(count);
				count = 1;
			}
			i++;
		}
		return res.toString();

	}

	public static void main(String[] args) {
		String s = "aaaabbeeebb";
		String res = stringCompression(s);
		System.out.println(res);
	}
}