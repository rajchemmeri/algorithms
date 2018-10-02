package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
  We are given two arrays A and B of words.  Each word is a string of lowercase letters.

  Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", 
  but is not a subset of "world".

  Now say a word a from A is universal if for every b in B, b is a subset of a. 

  Return a list of all universal words in A.  You can return the words in any order.

Example 1:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
Output: ["facebook","google","leetcode"]
Example 2:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
Output: ["apple","google","leetcode"]
Example 3:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","oo"]
Output: ["facebook","google"]
Example 4:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["lo","eo"]
Output: ["google","leetcode"]
Example 5:

Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
Output: ["facebook","leetcode"]

 */

public class WordSubset {

	public static void main(String[] args) {
/*		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = { "l","e" };
		
		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = { "e","o" };
		
		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = { "e","oo" };
		
		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = { "lo","eo" };*/
		
		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = { "ec","oc","ceo" };
		
		WordSubset obj = new WordSubset();
		
		List<String>  output = obj.wordSubsets(A,B);
				
		for(String s : output) {
			System.out.println( s);
		}

	}
	public List<String> wordSubsets(String[] A, String[] B) {


        Map<Character,Integer> winMap = createWindowMap(B);

        List<String>  output = parseDataString(A, winMap);

        return output;

	}

	private List<String> parseDataString(String[] A, Map<Character,Integer> winMap){

            Map<String,Map<Character,Integer>> dataMap = new HashMap<>();

            List<String>  output = new ArrayList<>();

            boolean isValid = false;

            for(int i =0 ;i< A.length;++i){

                    Map<Character,Integer> temp = new HashMap<>();

                    for(int j =0 ;j<A[i].length();++j){

                          int count = temp.getOrDefault(A[i].charAt(j),0);

                          temp.put(A[i].charAt(j), count+1);
                     }

                     for(Character x : winMap.keySet()){
                           if(  winMap.get(x) <= temp.getOrDefault(x,0) ){
                               isValid = true;
                           }else{
                              isValid = false;
                              break;
                           }
                    }
                    if( isValid )
                         output.add(A[i]);
            
          }
		      return output;
	}

	private Map<Character,Integer> createWindowMap(String[] search){

		Map<Character,Integer> winMap = new HashMap<>();

		if ( search == null )
			return winMap;

		for(int i =0 ;i < search.length;++i){

			  Map<Character,Integer> temp = new HashMap<>();

			  int j = 0;

          while( j < search[i].length()){

              int count = temp.getOrDefault(search[i].charAt(j),0);

              temp.put(search[i].charAt(j), count+1);

              ++j;

          }


          for(Character key : temp.keySet()){

              int count = temp.get(key);

              int pCount = winMap.getOrDefault(key, 0);

              if( count == 0 || count > pCount){
                winMap.put(key,count);
              }

			    }
		}
		return winMap;
	}
}
