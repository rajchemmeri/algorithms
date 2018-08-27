package array;

public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay obj = new CountAndSay();
		obj.countAndSay(6);
	}

	public String countAndSay(int n) {

		String input = "1";

		String result = "";

		for(int i = 0;i< n-1; ++i ) {
			int cno = 0;
			int pno = 0;
			int j = 0;
			int count = 0;
			StringBuilder builder =  new StringBuilder();	
			while( j <= input.length()) {

				  if( j < input.length()) {
				      cno = input.charAt(j) - 48;
					  if( j == 0 ) {
					      count+=1;
					      pno = cno;
					  }else if( pno == cno) {
					      count+=1;
					  }else {
					      builder.append(count).append(pno);
					      pno = cno;
					      count =1;
					  }
				  }else {
					result = builder.append(count).append(pno).toString();
				  }
			      ++j;
			}
		   input = result;

		}
		  System.out.println(input);
		return input;
	}

}
