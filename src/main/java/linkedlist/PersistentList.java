package linkedlist;

import java.util.Optional;

public class PersistentList {

	private final String value;
	private final Optional<PersistentList> next;

	public PersistentList() {
		next = Optional.empty();
		value = null;
	}

	private PersistentList(final String value, final PersistentList next) {
		this.value = value;
		this.next = Optional.of(next);
	}

	public int size() {
		if (next.isPresent()) {
			return 1 + next.get().size();
		}
		return 0;
	}

	public PersistentList add(final String element) {
		return new PersistentList(element, this);
	}

	public boolean contains(final String element) {
		if (next.isPresent()) {
			return value.equals(element) || next.orElse(new PersistentList()).contains(element);
		}
		return false;

	}

}
