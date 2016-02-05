import java.util.ArrayList;
import java.util.Collections;

public class SinglyLinkedList {

	Node firstLink = null;
	Node secondLink = null;

	/**
	 * Check if the Node is empty or not
	 */
	public boolean isEmpty() {
		return firstLink == null;
	}

	/**
	 * Insert elements in the beginning of the List
	 */
	public void insertFirst(int x) {

		Node newLink = new Node(x);

		if (isEmpty()) {
			newLink.next = firstLink;
			firstLink = newLink;
		} else {
			newLink.next = firstLink;
			firstLink = newLink;
		}
	}

	/**
	 * Insert elements at the end of the List
	 */
	public void insertLast(int x) {

		Node newLink = new Node(x);

		if (isEmpty()) {
			firstLink = newLink;
			secondLink = newLink;
		} else {
			secondLink.next = newLink;
			secondLink = newLink;
		}
	}

	/**
	 * Remove the first Element
	 */
	public Node removeFirst() {

		if (isEmpty()) {
			return null;
		} else {
			firstLink = firstLink.next;
		}
		return firstLink;
	}

	/**
	 * Check if the element is present or not
	 */
	public boolean find(int x) {
		Node current = firstLink;

		if (isEmpty())
			return false;

		while (current.id != x) {
			if (current.next == null)
				return false;
			else
				current = current.next;
		}
		return true;
	}

	/**
	 * Delete a particular Node, fails during duplication
	 */
	public Node delete(int x) {

		if (firstLink == null)
			return null;

		Node current = firstLink;
		Node previous = firstLink;

		while (current.id != x) {
			if (current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}

		if (current == firstLink)
			firstLink = firstLink.next;
		else
			previous.next = current.next;

		return firstLink;

	}

	/**
	 * Deletes all the instances of the value X
	 */
	public Node deleteAllInstance(int x) {

		if (firstLink == null)
			return null;

		Node current = firstLink;
		Node previous = firstLink;

		while (current != null) {

			if (current.id == x) {

				if (current == firstLink)
					firstLink = firstLink.next;
				else
					previous.next = current.next;
			} else {
				previous = current;
			}
			current = current.next;
		}

		return firstLink;

	}

	/**
	 * Deletes the duplicate of a particular number
	 */
	public Node removeDuplicatesofNumber(int x) { // Duplicates of a number

		Node current = firstLink;
		Node previous = firstLink;
		Node temp = firstLink;

		while (current != null) {
			if (current.id != x)
				current = current.next;
			else {
				temp = current;
				break;
			}
		}

		previous = temp;
		current = temp.next;

		while (current != null) {
			Node runner = temp;
			while (!(runner == current)) {
				if (current.id == x) {
					current = current.next;
					previous.next = current;
					break;
				}
				runner = runner.next;

			}
			if (runner == current) {
				previous = previous.next;
				current = current.next;
			}

		}
		return firstLink;
	}

	/**
	 * Removes all the duplicates of a number
	 */
	public Node removeDuplicates() { // Duplicates of all numbers

		Node current = firstLink.next;
		Node previous = firstLink;

		while (current != null) {
			Node runner = firstLink;
			// System.out.println(runner.id);
			while (!(runner == current)) {
				if (runner.id == current.id) {
					current = current.next;
					previous.next = current;
					break;
				}
				runner = runner.next;

			}
			if (runner == current) {
				previous = previous.next;
				current = current.next;
			}

		}
		return firstLink;

	}

	/**
	 * Sorting without the return of the Node
	 */
	public Node sort() {
		Node current = firstLink;
		ArrayList<Integer> ls = new ArrayList<Integer>();
		Node newLink = firstLink;
		while (current != null) {
			ls.add(current.id);
			current = current.next;
		}
		Collections.sort(ls);
		for (int i : ls) {
			newLink.id = ls.get(i);
			newLink = newLink.next;
		}

		return newLink;
	}

	/**
	 * Displays the Linked List
	 */
	public void display() {
		Node newLink = firstLink;
		while (newLink != null) {
			System.out.print("{" + newLink.id + "} ");
			newLink = newLink.next;
		}

	}

}
