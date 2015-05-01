public class SList {
	Node front;
	int size;

	public SList(int i) {
		front = new Node(i, null);
		size = 1;
	}

	public void insertFront(int i) {
		front = new Node(i, front);
		size++;
	}

	public int getFront() {
		return front.val;
	}

	public int size() {
		return size;
	}

	public void insertBack(int i) {
		if (front == null) {
			front = new Node(i, null);
			size = 1;

		} else {
			Node start = front;
			while (front.next != null) {
				front = front.next;
			}
			front.next = new Node(i, null);
		}
	}

	private class Node() {
		int val;
		Node next;

		public Node(int i, Node next) {
			val = i;
			this.next = next;
		}
	}
}

