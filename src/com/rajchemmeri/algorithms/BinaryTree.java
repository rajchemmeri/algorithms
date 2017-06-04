package com.rajchemmeri.algorithms;

public class BinaryTree {
	
	Node root = null;
	
	
	public BinaryTree(){
	}
	
	public BinaryTree(Node n){
		root  = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new BinaryTree().new Node(20);
		BinaryTree tree = new BinaryTree(n); 
		
		tree.insert(n, 25);
		tree.insert(n, 30);
		tree.insert(n, 15);
		tree.insert(n, 40);
	}

	private void insert(Node root,int x){
		if(  x > root.data  ){
			if( root.right != null){
				System.out.println(" recursive right ");
				insert(root.right, x);
			}else{
				System.out.println(" inserting right ");
				root.right = new Node(x);
			}
		}else{
			if( root.left != null){
				System.out.println(" recursive left ");
				insert(root.left, x);
			}else{
				System.out.println(" inserting left ");
				root.left = new Node(x);
			}
		}
	}
	
	private void delete(Node x, int data){
		
	}
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		
		
	}
}
