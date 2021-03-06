package linkedlist;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersistentListShould {

	@Test
	public void create_an_empty_list() throws Exception {
		final PersistentList sut = new PersistentList();

		assertThat(sut.size(), is(0));
	}

	@Test
	public void adding_an_element_returns_another_list() throws Exception {
		final PersistentList sut = new PersistentList();

		final PersistentList oneElement = sut.add("a");

		assertThat(sut, not(equalTo(oneElement)));
	}

	@Test
	public void add_one_element() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a");

		assertThat(oneElement.size(), is(1));
	}

	@Test
	public void not_be_affected_by_adding_an_element() throws Exception {
		final PersistentList emptyList = new PersistentList();

		emptyList.add("a");

		assertThat(emptyList.size(), is(0));
	}

	@Test
	public void add_several_elements() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a").add("b");

		assertThat(oneElement.size(), is(2));
	}

	@Test
	public void modify_size_according_to_add() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a");
		assertThat(oneElement.size(), is(1));

		final PersistentList twoElements = oneElement.add("b");
		assertThat(twoElements.size(), is(2));

		final PersistentList twoElements_2 = oneElement.add("c");
		assertThat(twoElements_2.size(), is(2));
	}

	@Test
	public void acceptance_test() throws Exception {
		final PersistentList oneElement = new PersistentList().add("a");
		assertThat(oneElement.size(), is(1));

		final PersistentList twoElements = oneElement.add("b");
		twoElements.add("c");
		twoElements.add("a");
		assertThat(twoElements.size(), is(2));
	}

	@Test
	public void store_one_element() throws Exception {
		final PersistentList sut = new PersistentList();

		final PersistentList oneElement = sut.add("a");

		assertThat(oneElement.contains("a"), is(true));
	}

	@Test
	public void not_contain_elements_when_empty() throws Exception {
		final PersistentList emptyList = new PersistentList();

		assertThat(emptyList.contains("a"), is(false));
	}

	@Test
	//TODO AGB name not good enough
	public void not_contain_the_element_when_the_only_element_is_not_matching() throws Exception {
		final PersistentList emptyList = new PersistentList();

		final PersistentList oneElement = emptyList.add("b");

		assertThat(oneElement.contains("a"), is(false));
	}

	@Test
	public void contain_the_first_element() throws Exception {
		final PersistentList emptyList = new PersistentList();

		final PersistentList severalElements = emptyList.add("b").add("a");

		assertThat(severalElements.contains("a"), is(true));
	}

	@Test
	public void contain_the_last_element() throws Exception {
		final PersistentList emptyList = new PersistentList();

		final PersistentList severalElements = emptyList.add("b").add("a");

		assertThat(severalElements.contains("b"), is(true));
	}

}
