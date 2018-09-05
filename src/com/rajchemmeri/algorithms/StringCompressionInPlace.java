package array;

public class StringCompressionInPlace {

	public static void main(String[] args) {

		//char[] input = "aaabbcccde".toCharArray();
		char[] input = "oooooooooo".toCharArray();

		//char[] input = "a".toCharArray();
		//char[] input = "abbbbbbbbbbbbx".toCharArray();

		int j = 0;
		int i = 1;
		int count = 1;
    
		while( i < input.length + 1 ) {

              if( i < input.length && input[i-1] == input[i] ) {
                    count++;
              }else {
                if(count > 9) {
                    int div = count/10;
                    int qt = count%10;
                    input[j] = input[i-1];
                    if( div > 0) {
                        input[++j] = Character.forDigit(div, 10);
                        input[++j] = Character.forDigit(qt, 10);
                    }
                     j = j + 1;
                     count =1;
                }else if( count > 1 && count <= 9 ) {
                    input[j] = input[i-1];
                    input[++j] = Character.forDigit(count, 10);
                    j = j+1;
                    count =1 ;
                }else {
                    input[j] = input[i-1];
                    j = j+1;
                }
              }
			    ++i;
		}

		System.out.println(new String(input));
		System.out.println("Length : "+ (j));

	}

	

}
