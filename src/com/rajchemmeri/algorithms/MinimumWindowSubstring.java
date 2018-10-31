package array;

import java.util.HashMap;
import java.util.Map;

//Q.NO : 76.
/*
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * Note:
	If there is no such window in S that covers all characters in T, return the empty string "".
	If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
	Example:

	Input: S = "PADOBECODEBANC", T = "ABC"
	Output: "BANC"
 * 
 */
package array;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

	/*
	 * Input: S = "PADOBECODEBANC", T = "ABC"
	   Output: "BANC"
	 * 
	 */

	public static void main(String[] args) {

		String S = "PADOBECODEBANC";
		String T = "ABC";
		SlidingWindow win = new SlidingWindow();
		win.parseDataString(S, T);
	}

	private Map<Character,Integer> createWindowMap(String t) {

		Map<Character,Integer> winMap = new HashMap<Character, Integer>();

		for(char x : t.toCharArray()) {
			int count = winMap.getOrDefault(x, 0);
			winMap.put(x, count+1);
		}
		return winMap;
	}

	private void parseDataString( String s, String t) {

		Map<Character,Integer> winMap =  createWindowMap(t);

		int counter = 0;
		int minLength = Integer.MAX_VALUE;
		int left = 0;
		int right = 0;

		while(right < s.length()) {

			char x = s.charAt(right);

			if(winMap.containsKey(x)) {

				winMap.put(x, winMap.get(x) - 1);
				if(winMap.get(x) >= 0 ) {
					counter += 1;
				}
			}
			
			
			
			if( counter == t.length()) {
				
				minLength = Math.min(minLength, right+1);
				
				while( counter == t.length()) {

					char key = s.charAt(left);

					if(winMap.containsKey(key)) {

						winMap.put(key, winMap.get(key)+1);
						
						if( winMap.get(key) > 0) {
							--counter;
							//break;
						}

					}
					++left;
				}
				minLength = Math.min(minLength, (right - left)+1);
				System.out.println(s.substring(left-1, right+1));
			}
			
			++right;
		}
			
		System.out.println("Min Length : "+ minLength);

	}
}

