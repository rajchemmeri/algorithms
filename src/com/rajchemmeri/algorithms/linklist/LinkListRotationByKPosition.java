package linklist;

/*
 * 
 * 61. Rotate List
		Given a linked list, rotate the list to the right by k places, where k is non-negative.

		Example 1:

		Input: 1->2->3->4->5->NULL, k = 2
		Output: 4->5->1->2->3->NULL

		Explanation:
		rotate 1 steps to the right: 5->1->2->3->4->NULL
		rotate 2 steps to the right: 4->5->1->2->3->NULL

		Example 2:

		Input : 0->1->2->NULL, k = 4
		Output: 2->0->1->NULL
	

		Explanation:
		rotate 1 steps to the right: 2->0->1->NULL
		rotate 2 steps to the right: 1->2->0->NULL
		rotate 3 steps to the right: 0->1->2->NULL
		rotate 4 steps to the right: 2->0->1->NULL
		
		Input: 1->2->3->NULL, k = 4
		rotate 1 steps to the right: 3->1->2->NULL
		rotate 2 steps to the right: 2->3->1->NULL
		rotate 3 steps to the right: 1->2->3->NULL
		rotate 4 steps to the right: 3->1->2->NULL
		rotate 5 steps to the right: 2->3->1->NULL
	    rotate 6 steps to the right: 1->2->3->NULL
	    rotate 7 steps to the right: 3->1->2->NULL

 * 
 */

public class LinkListRotationByKPosition {
	
	
	public static Node reverseListByK(Node root, int k) {

		if (root == null )
			return null;

		if( root.next == null )
			return root;

		Node slow  =  null;

		Node fast = root;

		Node prev = null;
		Node prev2 = null;

		int counter = 0;
		
		int tCnt = 0;

		while ( fast != null ) {

			++counter;

			if( counter == k + 1) {
				slow = fast;
				counter = 0;
			}
			prev = fast;
			fast = fast.getNext();

		}
		
		if( slow != null ) {
			Node temp  = slow.getNext();

			slow.setNext(null);

			prev.setNext(root);

			root = temp;
		}else {

			fast  = root;
			
			if( k % counter > 0) {
				
				k = k % counter;

				while( tCnt < counter - k ) { 
					prev2 = fast;
					fast = fast.getNext();
					++tCnt;
				}
				prev2.setNext(null);
				prev.setNext(root);
				root = fast;
			}
			
		}
		


		return root;
	}

	static class Node{

		private Node next;
		private int data;

		public Node(int n) {
			this.data = n;
		}

		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}

	}

	public static Node createList_example1(int n) {

		Node root = new Node(1);

		Node prev = root;

		for(int i=2 ; i<=n ; ++i ) {

			Node nd = new Node(i);

			prev.setNext(nd);

			prev = nd;
		}

		return root;
	}


	

	public static void display(Node root) {
		if (root == null ) {
			System.out.println("Empty list");
			return;
		}

		while( root != null ) {
			System.out.print(root.getData());
			if( root.getNext() != null)
				System.out.print(" ->");
			root = root.getNext();

		}
	}

	public static void main(String[] str) {

		Node root = LinkListRotationByKPosition.createList_example1(3);

		root = LinkListRotationByKPosition.reverseListByK(root, 7);

		LinkListRotationByKPosition.display(root);

	}

}
