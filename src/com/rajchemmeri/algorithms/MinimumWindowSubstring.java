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
public class MinimumWindowSubstring {

	public static void main(String[] args) {
		MinimumWindowSubstring obj = new MinimumWindowSubstring();
	//	int min = obj.minWindow("PADOBECODEBANC", "ABC");
		int min = obj.minWindow("ADOBECODEBANCABC", "ABC");
		System.out.println("Min : "+ min);
	}

	public int minWindow(String input, String search) {

		int minLength = Integer.MAX_VALUE;

		Map<Character,Integer> srchCharCnt = new HashMap<Character,Integer>();
		Map<Character,Integer> winMap = new HashMap<Character,Integer>();

		getSrchCharCount(srchCharCnt, search);

		int start = 0;
		int end  = 0;
		int winSize = 0;

		
		//	Input: S = "PADOBECODEBANC", T = "ABC"

		while( start <= end) {
			
			if( end < input.length()) {
				
				char p = input.charAt(end);

				int count = srchCharCnt.getOrDefault(p, 0);

				if( count != 0 ) {
					winMap.put(p, winMap.getOrDefault(p, 0)+1);
					  if(winMap.get(p).intValue() ==  srchCharCnt.get(p).intValue())
						  winSize+=1;
				}

					if( winSize == search.length()) {
        
				    		while(start < input.length() && 
					  		srchCharCnt.getOrDefault(input.charAt(start), 0) == 0 || 
								winMap.getOrDefault(input.charAt(start),0).intValue() > srchCharCnt.getOrDefault(input.charAt(start),0)) {

						  if(winMap.getOrDefault(input.charAt(start),0).intValue() > srchCharCnt.getOrDefault(input.charAt(start),0))
							winMap.put(input.charAt(start), winMap.get(input.charAt(start)).intValue()-1);
						  ++start;
				    		}

					    minLength = Math.min(minLength, (end - start)+1);

					    winMap.put(input.charAt(start), winMap.get(p).intValue()-1);

					    winSize = winSize-1;

					    start++;
					}
				
				}
				++end;
			}

		return minLength;
	}
	private void getSrchCharCount(Map<Character,Integer> srchCharCnt, String search) {

		for(char x : search.toCharArray()) {

			int count  = srchCharCnt.getOrDefault(x, 0);
			srchCharCnt.put(x, count+1);

		}
	}
}
