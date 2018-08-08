package array;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String input = "){";
		
		ValidParenthesis obj = new ValidParenthesis();
		
		System.out.println(" Response : " + obj.parse(input));


	}

	public boolean parse(final String input) {
		
		boolean isValid = isValidInput(input);
		
		isValid = isValidStart(input.charAt(0));
		
		if(isValid ) {
			Stack<Character> data = new Stack<Character>();
			for(char x  : input.toCharArray()) {
				if(isValidStart(x)) {
					data.push(x);
				}else {
					char y = '-';
					if(!data.isEmpty())
					   y = data.pop();
					if(!	valid( y, x)) {
						isValid = false;
						break;
					}
				}
			}
			if(!data.isEmpty()) {
				isValid = false;
			}
		}
		return isValid;
	}

	private boolean isValidInput(final String input) {
		boolean isValid = true;
		if( input == null || input.length() == 0) {
			isValid = true;
		}else if( input != null && input.length() < 2) {
			isValid = false;
		}
		return isValid;
	}
	private boolean isValidStart(char x) {
		if (x == '{' || x == '(' || x == '[') {
			return true;
		}
		return false;
	}

	public boolean valid(char s, char e) {

		boolean isValid = false;

		if( s == '{'   &&  e == '}') {
			isValid = true;
		}else if (s == '('   &&  e == ')' ) {
			isValid = true;
		}else if (s == '['   &&  e == ']' ) {
			isValid = true;
		}
		return isValid;
	}

}
