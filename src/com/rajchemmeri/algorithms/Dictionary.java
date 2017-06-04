package com.rajchemmeri.algorithms;

public class Dictionary {
	
	class Dict{
		Dict[] bucket;
		char data;
		boolean isLeaf = false;
		
		public Dict(){
			bucket =  new Dict[26] ;
		}
		
		
	}
	private void insert(String word){
		Dict itr = null; 
		for(int i=0 ; i< word.length();++i){
			char x = Character.toLowerCase(word.charAt(i));
			int bucketPos = x - 97;
				
				if(head.bucket[bucketPos] == null){
					head.bucket[bucketPos] = new Dict();
					head.bucket[bucketPos].data = x;
					if( i == word.length() - 1){
						head.isLeaf = true;
					}
					head = head.bucket[bucketPos];
					System.out.println( " itr Pos "+ i);
					System.out.println( " itr  "+ (head == null?"NULL":"NOT NULL"));
				}
		}
	}
	
	Dict head = new Dict();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dict = new Dictionary();
		
		Dict head = dict.new Dict();
		
		String word = "Rabbit";
		
		dict.insert(word);
		
		
		
		
		
	}

}
