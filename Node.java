
public class Node {

	public int id;

	public Node next;

	Node(int val) {
		id = val;
	}

	public static void main(String[] args) {

		SinglyLinkedList insertFirst = new SinglyLinkedList();
		SinglyLinkedList insertLast = new SinglyLinkedList();

		// Insert First
		System.out.println("Inserting First");
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(1);
		insertFirst.insertFirst(1);
		insertFirst.insertFirst(1);
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(6);
		insertFirst.insertFirst(6);
		insertFirst.display();
		System.out.println();

		System.out.println();
		System.out.println("Sorting in ascending");
		insertFirst.sort(); // Sorting of the List.
		insertFirst.display();
		System.out.println();

		System.out.println();
		System.out.println("Remove first Element");
		insertFirst.removeFirst(); // Remove the First Element
		insertFirst.display();
		System.out.println();

		System.out.println();
		System.out.println("Removing duplicates of a particular number 1");
		insertFirst.removeDuplicatesofNumber(1); // Removes duplicates of a
													// Number
		insertFirst.display();
		System.out.println();

		System.out.println();
		System.out.println("Removing all duplicates");
		insertFirst.removeDuplicates(); // Removes all the duplicates present in
										// the List
		insertFirst.display();
		System.out.println();
		System.out.println();

		// Insert Last
		System.out.println("Inserting Last");
		insertLast.insertFirst(5);
		insertLast.insertFirst(3);
		insertLast.insertFirst(2);
		insertLast.insertFirst(5);
		insertLast.insertFirst(1);
		insertLast.insertFirst(7);
		insertLast.insertFirst(0);
		insertLast.insertFirst(1);
		insertLast.insertFirst(0);
		insertLast.insertFirst(0);
		insertLast.display();
		System.out.println();

		System.out.println();
		System.out.println("Sorting in ascending");
		insertLast.sort(); // Sorting of the List.
		insertLast.display();
		System.out.println();

		System.out.println();
		System.out.println("Remove first Element");
		insertLast.removeFirst(); // Remove the First Element
		insertLast.display();
		System.out.println();

		System.out.println();
		System.out.println("Removing duplicates of a particular number 0");
		insertLast.removeDuplicatesofNumber(0); // Removes duplicates of a
												// Number
		insertLast.display();
		System.out.println();

		System.out.println();
		System.out.println("Removing all duplicates");
		insertLast.removeDuplicates(); // Removes all the duplicates present in
										// the List
		insertLast.display();
		System.out.println();

	}

}
