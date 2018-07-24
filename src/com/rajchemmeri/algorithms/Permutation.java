package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		String input ="ABC";

		Permutation obj = new Permutation();

		List<String> bag = new ArrayList<String>();

		obj.permuation(input, "", bag);
		
		for(String s : bag) {
			System.out.println(s +", ");
		}

		

	}
	//ABC
	public void permuation(String input, String output, List<String> bag) {

		if( input.length() == 0) {
			bag.add(output);
		}else {
			for( int i=0 ; i < input.length(); ++i){
				String subStr = input.substring(0,i) + input.substring(i+1);
				permuation(subStr, output + input.charAt(i), bag);
			}

		}

	}

}
