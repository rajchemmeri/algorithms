package leet;

import java.util.HashSet;

public class LongestSubWithoutRepeating {

	public static void main(String[] args) {
		HashSet<Character> set = new HashSet<Character>();
		
		String input  = "abcabcbb";
		
		int startPos = 0;
		int curMax = 0;
		String maxString = "";
		for(int i =0;i<input.length();++i) {
			char x = input.charAt(i);
			if( set.contains(x) ) {
				curMax = Math.max(curMax, i - startPos);
				maxString = input.substring(startPos, i);
				startPos = i;
				set.clear();
			}else {
				set.add(x);
			}
		}
		System.out.println("max "+ maxString);

	}

}
