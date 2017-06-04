package com.rajchemmeri.algorithms;

public class LinkLinkTest {
	
	
	static class Node{
		Node next = null;
		int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	Node node;
	
	private void addNode(Node nd){
		Node itr = node;
		
		if( node == null){
			this.node = nd;
			return;
		}
		while(itr != null && itr.next != null){
			itr = itr.next;
		}
		itr.next = nd;
	}
	
	private void printNode(){
		Node next = node;
		while(next!= null){
			System.out.println( next.data);
			next = next.next;
		}
	}
	
	private void insertAtPostion(Node n, int pos){
		Node itr = node;
		Node swap = null;
		int cntr = 0;
		while(itr != null ){
			if( cntr == pos){
				swap = itr.next; 
				break;
			}else{
				itr = itr.next;
			}
			cntr = cntr +1;
		}
		itr.next = n;
		n.next = swap;
	}
	
	private void findLenth(){
		Node next = node;
		int count = 0;
		while(next!= null){
			count = count + 1;
			next = next.next;
		}
		System.out.println( " Total Length :"+count);
	}
	
	private void delete(int pos){
		Node itr = node;
		int counter  = -1;
		Node swap = null;
		if( itr != null){
			counter = 0;
			if( pos == counter){
				node = node.next;
			}else{
				while(itr.next != null){
					counter += 1;
					if(counter == pos - 1){
						swap = itr.next;
						break;
					}
				}
				itr.next = swap.next;
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkLinkTest lnk = new LinkLinkTest();
		
	
		Node n = new Node(1);
		lnk.addNode(n);
		
		Node n1 = new Node(2);
		lnk.addNode(n1);
		
		Node n3 = new Node(3);
		lnk.addNode(n3);
		
		Node n4 = new Node(4);
		lnk.insertAtPostion(n4,1);
		
		
		lnk.printNode();
		
		lnk.findLenth();

	}

}
