package com.rajchemmeri.algorithms;

//Remove duplicate from linked list with/without using buffer

public class LInkListRemoveDup {
	
	static class Node{
		
		public Node(int x){
			this.data = x;
		}
		int data;
		Node next;
		
	}
	
	Node parent;
	
	private void deleteWithNoBuffer(final int data){
		if(parent!= null){
			if( parent.data == data){
				parent = parent.next;
			}else{
				Node tParent = parent;
				while(tParent.next != null){
					if( tParent.next != null && tParent.next.data == data ){
						tParent.next = tParent.next.next;
					}
					tParent = tParent.next;
				}
			}
		}
	}
	
	private void addNode(int data){
		if(parent == null){
			parent = new Node(data);
		}else{
			Node itr = parent;
			while(itr.next != null){
				itr = itr.next;
			}
			itr.next = new Node(data);
		}
	}
	
	private void print(){
		Node itr = parent;
		System.out.println(" Printing .....");
		while(itr != null){
			System.out.println( " "+itr.data);
			itr = itr.next;
		}
	}
	
	private int  printKthElement(Node x,int k ){
		if ( x == null ){
			return 0;
		}
		
		
		int index = printKthElement(x.next, k) + 1;
		
		if( index == k){
			System.out.println(" node data "+ x.data);
		}
		System.out.println(" node......");
		return index;
	}
	
	class Index{
		public int index = 0;
	}
	
	private Node  printKthElement(Node x,int k, Index index ){
		
		if ( x == null)
			return null;
		

		Node y = printKthElement(x.next, k , index);
		
		index.index = index.index + 1;
		
		if( index.index == k){
			System.out.println(" node data "+ y.data);
		}
		System.out.println(" Returning node......with data"+ x.data);
		return x;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LInkListRemoveDup rDup = new LInkListRemoveDup();
		rDup.addNode(1);
		rDup.addNode(2);
		rDup.addNode(3);
		rDup.addNode(4);
		rDup.addNode(5);
		rDup.addNode(6);
		
		rDup.print();
		rDup.deleteWithNoBuffer(4);
		
		rDup.print();
		Node x = rDup.parent;
		rDup.printKthElement(x , 4);
		System.out.println("###########################");
		LInkListRemoveDup.Index  ind = rDup.new Index();
		ind.index = 0;
		rDup.printKthElement(x , 4,ind);
		
	}

}
