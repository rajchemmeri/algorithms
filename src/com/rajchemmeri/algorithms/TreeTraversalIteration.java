package tree;

import java.util.Stack;

public class TreeTraversalIteration {

	static class Node{
		int data;
		Node left;
		Node right;
        public Node(int data) {
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
	public static void main(String[] args) {
		Node root = new Node(1);
		
		Node rleft = new Node(2);
		Node rright = new Node(3);
		root.setLeft(rleft);
		root.setRight(rright);
		
		Node four = new Node(4);
		Node five = new Node(5);
		rleft.setLeft(four);
		rleft.setRight(five);
		
		Node six = new Node(6);
		Node sev = new Node(7);
		rright.setLeft(six);
		rright.setRight(sev);
		
		Node eig = new Node(8);
		four.setRight(eig);
		
		Node nin = new Node(9);
		Node ten = new Node(10);
		
		five.setLeft(nin);
		five.setRight(ten);
		
		Node ele = new Node(11);
		six.setRight(ele);
		
		Node twe = new Node(12);
		Node thi = new Node(13);
		sev.setLeft(twe);
		sev.setRight(thi);
		
		TreeTraversalIteration obj = new TreeTraversalIteration();
    System.out.println(" PreOrder : ");
		obj.preOrder(root);
    
		System.out.println(" Inorder : ");
		obj.inOrder(root);
    
		System.out.println(" PostOrder : ");
		obj.postOrder(root);
		
	}

	public void preOrder(Node root) {

		Stack<Node> stack = new Stack<Node>();

		Node temp = root;

		while( temp != null || !stack.isEmpty()) {

			if( temp != null) {
				  visit(temp);
				  stack.push(temp);
				  temp = temp.getLeft();
			}else {
				if(stack.size() >  0) {
					  temp = stack.pop();
					  temp = temp.getRight();
				}
			}

		}

	}
	public void inOrder(Node root) {
		Stack<Node> stack = new Stack<Node>();

		Node temp = root;
		
		while(temp != null || !stack.isEmpty()) {
			if( temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}else {
				temp = stack.pop();
				visit(temp);
				temp = temp.getRight();
			}
		}
	}
	
	public void postOrder(Node root) {
		Stack<Node> stack = new Stack<Node>();

		Node temp = root;
		Node lastDel  = null;
		Node aux = null;
		while(temp != null || !stack.isEmpty()) {
			if(temp != null) {
				  stack.push(temp);
				  temp = temp.getLeft();
			}else {
				  aux = stack.peek();
				  if( lastDel != aux.getRight() && aux.getRight() != null ) {
					    temp =  aux.getRight();
				  }else {
					    visit(aux);
					    lastDel = aux;
					    stack.pop();
					    temp = null;
				  }
			}
		}
	}
	public void visit(Node n) {
		System.out.println(n.data);
	}
}
