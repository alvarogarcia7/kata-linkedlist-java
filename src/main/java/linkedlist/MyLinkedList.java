package linkedlist;

public class MyLinkedList<Type> {

	private Node<Type> node;

	public MyLinkedList() {
		node = new EmptyNode<Type>();
	}

	public Integer size() {
		return node.size();
	}

	public void add(final Type string) {
		node = node.add(string);
	}

	public Boolean contains(final Type string) {
		return node.contains(string);
	}

	@Override
	public String toString() {
		return "[" + node.toString() + "]";
	}

	public void addAt(final int index, final Type string) {
		node = node.addAt(index, string);
	}

	public Type at(final int index) {
		return node.at(index);
	}
}
