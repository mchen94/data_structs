public class IntList {

	int head;
	IntList tail;

	public IntList(int i, IntList tail) {
		this.head = i;
		this.tail = tail;
	}

	public nth(int i) {
		if (i == 0) {
			return this.head;
		} else {
			return this.tail.get(i-1);
		}
	}

	public size() {
		if (this.tail == null) {
			return 1;
		} else {
			return 1 + this.tail.size();
		}
	}

	public IntList incrList(IntList L, int x) {
		if (L == null) {
			return null;
		}
		int newHead = L.head + x;
		IntList newTail = incrList(L.tail, x);
		return new IntList(newHead, newTail);
	}

	public IntList dincrList(IntListL, int x) {
		return incrList(L, -x);
	}
}
