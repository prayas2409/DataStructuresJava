
public class Node {

	private Object data;
	public Node next;
	public Node previous;
	
	public Node(Object o, Node next,Node previous) {
		this.data = o;
		this.next=next;
		this.previous = previous;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public void setData(Object o) {		
		this.data = o;
	}
	
}
