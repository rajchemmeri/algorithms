package leet;

import java.util.HashMap;

public class LongestSubWithoutRepeating {

	public static void main(String[] args) {
		HashMap<Character,Integer> set = new HashMap<Character,Integer>();

		//String input  = "bbbbb";
		//String input  = "pwwkew";
		String input = "abcabcbb";

		int startPos = 0;
		int curMax = 0;
		String maxString = "";
		for(int i =0;i<input.length();++i) {
			Integer prevIndx = set.put(input.charAt(i),i);
			if( prevIndx != null && prevIndx  >= startPos) {
				if( curMax < Math.max(curMax, i - startPos)) {
					maxString = input.substring(startPos, i);
					curMax = i - startPos;
				}
				startPos = i;
			}

		}
		System.out.println("max "+ maxString);

	}

}
