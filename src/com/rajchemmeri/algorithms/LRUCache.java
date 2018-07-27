package competetive;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	static class Node{
		int data;
		int key;
		Node next;
		Node prev;
		public Node(int key,int data) {
			this.data = data;
			this.key = key;
		}
	}
	Map<Integer,Node> cache = null;

	Node head;
	Node tail;
	
	int capacity;
	int size;
	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache  = new HashMap<Integer,Node>();
	}

	public void put(int key, int data) {
		if( size >= capacity) {
			evit();
		}
		//print();
		if( size < capacity) {	
			Node n = new Node(key,data);
			cache .put(key, n);
			if( head == null ) {
				head = n;
				n.next= n;
				head.prev = n;
				tail = head;
			}else {
				n.prev = head.prev;
				n.next = head;
				head.prev = n;
				
				tail.next = n;
				head = n;
			}
			++size;
		}
	}

	public int get(int key) {
		Node gt = cache.get(key);
		//	System.out.println( "Data : "+ gt.data);
		if ( gt == null )
			return -1;
		if( gt == head)
			return gt.data;
		if( gt == tail) {
			Node tPrv = tail.prev;
			head = tail;
			tail = tPrv;
			
		}
		if( gt != head && gt  != tail  ) {
		
			Node n = gt;
			n.next.prev =n.prev;
			n.prev.next = n.next;

			n.prev = tail;
			n.next = head;
			head = n;
		}
		//	print();
		return gt.data;
	}

	public void evit() {
		System.out.println(" In evict ");
	//	print();
		
		Node tem = tail;
		System.out.println(" Data from tail "+ tem.data);
		if( tem != null) {
			tem.prev.next = tem.next;
			head.prev = tem.prev;
			tail = tem.prev;
			cache.remove(tem.key);
			--size;
		}

	}
	public void print() {
		Node itr = head;
		System.out.println("Start printing");
		while(itr != null) {
			System.out.println(itr.data);
			if( itr == head)
				break;
			else
				itr =itr.next;
		}

	}
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);

		cache.put(1, 1);
		cache.put(2, 2);
		//cache.print();
		
		int x =  cache.get(1);
		cache.put(3, 3);
		System.out.println("Get ---->"+cache.get(2));
		
	}

}
