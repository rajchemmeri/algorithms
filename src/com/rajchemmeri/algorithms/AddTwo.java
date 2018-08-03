package leet;

public class AddTwo {

	static class Node{

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	private int findLength(Node lst) {
		int count = 0;

		if( lst == null) {
			return count;
		}
		Node itr = lst;
		while( itr != null) {
			++count;
			itr = itr.next;
		}
		return count;
	}
	private void adjustLength(Node lst, int count) {
		if ( lst == null)
			return;
		int i = 0;
		while(i < count) {
			Node t = new Node(0);
			t.next = t;
			++i;
		}
	}
	
	private Node sum(Node opr1, Node opr2) {
		
		int l1 = findLength(opr1);
		int l2 = findLength(opr2);
		
		Node result = null;
		Node finalRes =null;
		if( l1 != l2) {
			int diff = Math.abs(l1 -l2);
			if( l1 < l2) {
				adjustLength(opr1,diff);
			}else {
				adjustLength(opr2,diff);
			}
		}
		
		Node itr1 = opr1;
		Node itr2 = opr2;
		int qt = 0;
		while( itr1 != null && itr2 !=null) {
			int d1 = itr1.getData();
			int d2 = itr2.getData();
		
			int tot =  qt +d1 + d2;
			if(tot / 10 > 0) {
				qt = (d1 + d2)/10;
			}else {
				qt = 0;
			}
			Node temp = null;
			if( qt  > 0) {
				int mod =  tot % 10;
				temp = new Node(mod);
			}else {
				temp = new Node(tot);
			}
			if( result == null) {
				result = temp;
				finalRes =result;
			}else {
				result.setNext(temp);
				result = result.getNext();
			}
			itr1 = itr1.getNext();
			itr2 = itr2.getNext();
		}
		
		return finalRes;
	}
	
	private Node reverse(Node result) {
		if( result == null) {
			return null;
		}
		
		Node itr = result;
		
		Node res = null;
		

		while(itr!= null ) {
			Node curNxt = itr.getNext();
			if( res == null ) {
				res = itr;
				res.setNext(null);
			}else {
				itr.setNext(res);
				res = itr;
			}
			itr = curNxt;
		}
		return res;
	}
	
	public void print(Node p) {
		
		while(p!= null) {
			System.out.println(p.getData());
			p = p.getNext();
		}
	}

	public static void main(String[] args) {
		
		AddTwo obj = new AddTwo();
		
		Node op1 = new Node(2);
		Node op11 = new Node(4);
		Node op12 = new Node(3);
		op1.setNext(op11);
		op11.setNext(op12);
		
		
		Node op2 = new Node(5);
		Node op21 = new Node(6);
		Node op22 = new Node(4);
		op2.setNext(op21);
		op21.setNext(op22);
		
		Node result = obj.sum(op1, op2);
		
		result = obj.reverse(result);
		obj.print(result);
		
		
	}

}
