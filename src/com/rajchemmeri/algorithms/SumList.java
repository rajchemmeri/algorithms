package com.rajchemmeri.algorithms;

public class SumList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int x){
			this.data =x;
		}
	}
	
	Node op1;
	
	Node op2;
	
	public void createOperandList1(int data){
		if(op1 == null){
			op1 = new Node(data);
		}
		else{
			Node itr = op1;
			while( itr != null && itr.next != null){
				itr = itr.next;
			}
			itr.next = new Node(data);
		}
	}
	public void createOperandList2(int data){
		if(op2 == null){
			op2 = new Node(data);
		}
		else{
			Node itr = op2;
			while( itr != null && itr.next != null){
				itr = itr.next;
			}
			itr.next = new Node(data);
		}
	}
	
	private Node parseOperand1(int x){
		while( x > 0 ){
			System.out.println( " "+ x % 10);
			this.createOperandList1(x % 10);
			x = x / 10;
		}
		return op1;
	}
	private Node parseOperand2(int x){
		while( x > 0 ){
			System.out.println( " "+ x % 10);
			this.createOperandList2(x % 10);
			x = x / 10;
		}
		return op2;
	}
	
	private Node reverse(Node node){
		if( node == null){
			return null;
		}
		
		Node x = reverse(node.next);
		node.next = x;
		return  node;
	}
	
	private void palindrome(Node head, Node tail ){
		if( head == tail){
			return;
		}
		
		palindrome(head, head.next);
		
		if( head.data != tail.data){
			
		}
		return  last;
	}
	
	private Node addList(Node op1, Node op2, int cf){
		if(op1 == null && op2 == null && cf == 0){
			return null;
		}
		int result = 0;
		result += cf;
		
		if(op1 != null){
			result = result + op1.data;
		}
		if(op2 != null){
			result = result + op2.data;
		}
		Node resNode = new Node(result%10); 
		
		//Node next =addList(op1.next != null?,op2.next,result>10?1:0);
		Node next =addList(op1!= null?op1.next:null,op2!= null?op2.next:null,result>10?1:0);

		
		resNode.next = next;
		
		return resNode;
	}
	
	private void resultData(Node x){
		
		if( x == null){
			return;
		}
		resultData(x.next);
		System.out.print(x!=null?x.data:"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumList sumList = new SumList();
		
		int x = 617;
		Node op1 = sumList.parseOperand1(x);
		
		
		int y = 2956;
		Node op2 =sumList.parseOperand2(y);
		
		Node res = sumList.addList(op1, op2, 0);
	
		sumList.resultData(res);
		
		Node pp = sumList.reverse(op1);
		
		sumList.resultData(pp);
		
		
	}

}
