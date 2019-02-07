
public class QueueCustom {

	Node head;
	private int count;
	
	public QueueCustom() {
		head=null;
		count=0;
	}
	
	public boolean isEmpty() {
	return this.head==null;
	}
	
	public void enque(Object o) {
		if (this.isEmpty()) {
			//// if empty just iniitialize the fist node
			this.head = new Node(o, null, null);
		} else {
			//// add a new node infront
			Node temp = new Node(o, null, null);
			this.head.previous = temp;
			temp.next = head;
			this.head = temp;
		}
		count++;
	}
	
	public void deque() {
		
		if (this.isEmpty()) {
			System.out.println("Linked list already empty");
			return;
		} else if (this.head.next == null) {
			//// only 1 element in the array
			this.head = null;
		} else {
			Node current = this.head;
			while (current.next != null) {
				current = current.next;
			}

			Node temp = current.previous;
			temp.next = null;
		}
		count--;
	}
	
	public int size() {
		return count;
	}
	
	public void display() {
		
		if(this.isEmpty()) {
			System.out.println("The Queue is empty");
			return;
		}
		
		Node current = this.head;
		while(current!=null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}

	public Node getFirst() {
		return this.head;
	}
	
	public Node getLast() {
		if(this.isEmpty()) {
			System.out.println("The Linkedlist is empty");
			return null;
		}
		
		Node current = this.head;
		while (current.next != null)
			current = current.next;
		return current;
	}
	
}
