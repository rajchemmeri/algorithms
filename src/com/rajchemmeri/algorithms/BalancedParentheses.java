package com.rajchemmeri.algorithms;

public class BalancedParentheses {
	
	String exp;
	
	char[] tokens;
	
	java.util.Stack<Character> stk = new java.util.Stack<Character>();
	
	boolean isValid = true;
	
	public BalancedParentheses(String st){
		System.out.println(" The string is "+ st);
		this.exp = st;
		tokens = exp.toCharArray();
	}
	
	public boolean parase(){
		for(int i =0;i< tokens.length ;++i){
			
			 char c = tokens[i];
			 
			if( c == '(' ||  c == '{'  || c == '['){
				stk.push(c);
				System.out.println("adding to stack "+ c);
			}
			
			if( c == ')' || c == '}' || c == ']'){
				Character x = (Character)stk.pop();
				isValid = isMatching(c, x.charValue());
				System.out.println(" c = : "+ c + "x = : "+ x.charValue() + "isValid : "+isValid);
				if(isValid)
					continue;
				else
					break;
			}
		}
		return isValid;
	}
	
	private boolean isMatching(char c, char x){
		boolean isValid = false;
		if(c == ')' && x == '('){
			System.out.println(" matching parenthesis");
			isValid = true;
		}else if(c == '}' && x == '{'){
			isValid = true;
		}else if(c == ']' && x == '['){
			isValid = true;
		}
		return isValid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp =  "[()]{}{[()()]()}";
		
		exp = "[(])";
		
		BalancedParentheses par = new BalancedParentheses(exp);
		
		
		System.out.println(par.parase());
		
	}

}
