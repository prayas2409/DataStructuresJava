
public class StackCustom {

	Node top;
	private int count;
	
	public StackCustom() {
		this.top=null;
		count=0;
	}
	
	public boolean isEmpty() {
	return this.top==null;
	}
	
	public void pop() {
		if (this.isEmpty()) {
			System.out.println("Linked list already empty");
			return;
		} else if (this.top.next == null) {
			//// If only 1 element in the linked list
			this.top = null;
			count--;
		} else {
			Node current = this.top;
			current = current.next;
			current.previous = null;
			this.top = current;
			count--;
		}
	}
	
	public void push(Object o) {
		if (this.isEmpty()) {
			//// if empty just iniitialize the fist node
			this.top = new Node(o, null, null);
		} else {
			//// add a new node infront
			Node temp = new Node(o, null, null);
			this.top.previous = temp;
			temp.next = top;
			this.top = temp;
		}
		count++;
	}

	public Node getTop() {
		return this.top;
	}
	
	public void display() {
		
		if(this.isEmpty()) {
			System.out.println("The Queue is empty");
			return;
		}
		
		Node current = this.top;
		while(current!=null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
	
}
