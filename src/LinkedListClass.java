
public class LinkedListClass {

	Node head;
	private int count;

	public LinkedListClass() {
		head = null;
		count = 0;
	}

	public Node getFirst() {
		return this.head;
	}

	public Node getLast() {

		if (this.isEmpty()) {
			System.out.println("The Linkedlist is empty");
			return null;
		}

		Node current = this.head;
		while (current.next != null)
			current = current.next;
		return current;
	}

	public boolean isEmpty() {
		return this.head == null ? true : false;
	}

	public void addFirst(Object o) {

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
		System.out.println("Deleted Successfully");
		count++;
	}

	public void deleteObject(Object o) {
		if (this.isEmpty()) {
			//// if linked list is empty
			System.out.println("Link list is empty");
			return;
		} else if (this.head.getData() == o) {
			//// if the node is first one
			this.deleteFirst();
		} else {
			Node current = this.head;
			//// traversing the linked list
			while (current != null) {
				if (current.getData().equals(o)) {
					break;
				}
				current = current.next;
			}

			if (current == null) {
				//// object not found
				System.out.println("Object not found");
				return;
			} else if (current.next == null) {
				//// deleting Last node
				this.deleteLast();
			} else {
				Node temp = current.previous;
				temp.next = current.next;
				current = current.next;
				current.previous = temp;
				System.out.println("Deleted successfully");
			}

		}
		count--;
	}

	public boolean deleteFirst() {
		if (this.isEmpty()) {
			System.out.println("Linked list already empty");
			return false;
		} else if (this.head.next == null) {
			//// If only 1 element in the linked list
			this.head = null;
			count--;
			System.out.println("Deleted Successfully");
			return true;
		} else {
			Node current = this.head;
			current = current.next;
			current.previous = null;
			this.head = current;
			count--;
			System.out.println("Deleted Successfully");
			return true;
		}
	}

	public void deleteLast() {
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
		System.out.println("Deleted Successfully");
		count--;
	}

	public void print() {
		if (this.isEmpty()) {
			System.out.println("Empty Linked List");
		} else {
			Node current = this.head;
			while (current != null) {
				System.out.println(current.getData() + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public int size() {
		return this.count;
	}

	public void add(Object o) {
		if (this.isEmpty()) {
			this.head = new Node(o, null, null);
			this.count++;
		} else {
			Node current = this.head;
			Node temp = new Node(o, null, null);
			while (current.next != null) {
				current = current.next;
			}

			temp.previous = current;
			current.next = temp;
			this.count++;
		}
		System.out.println("Added Successfully");
	}

	public boolean search(Object o) {

		if (this.isEmpty()) {
			//// if linked list is empty
			System.out.println("Link list is empty");
			return false;
		}
		Node current = this.head;
		//// traversing the linked list
		while (current != null) {
			if (current.getData().equals(o)) {
				System.out.println("Object found");
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void sort() {
		int i = 0;
		Object o;
		while (i < this.count) {
			Node current = this.head.next;
			Node temp = this.head;
			while (current!=null) {
				//System.out.println("Comparing "+temp.getData()+" with "+current.getData()+" gives "+(temp.getData().toString().compareTo(current.getData().toString())));
				if((temp.getData().toString().compareTo(current.getData().toString()))>0) {
				o=temp.getData();
				temp.setData(current.getData());
				current.setData(o);				
				}
				temp=current;
				current=current.next;
			}
			i++;
		}
	}

}
