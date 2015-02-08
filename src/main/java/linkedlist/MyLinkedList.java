package linkedlist;

public class MyLinkedList {

	private Node node;

	public MyLinkedList() {
		node = new EmptyNode();
	}

	public Integer size() {
		return node.size();
	}

	public void add(final String string) {
		node = node.add(string);
	}

	public Boolean contains(final String string) {
		return node.contains(string);
	}

	@Override
	public String toString() {
		return "[" + node.toString() + "]";
	}

	public void addAt(final int index, final String string) {
		if (0 == index) {
			node = node.addAt(index, string);
		} else {
			add(string);
		}
	}

	public String at(final int index) {
		return node.at(index);
	}
}
