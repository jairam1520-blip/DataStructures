package singlyLinkedList;
class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class SinglyLinkedList {
	
	
    /* * * * *Insertion* * * */
	public static Node insertAtLast(Node head, int data) {
		Node node = new Node(data);
		node.next = null;
		Node current = head;

		if (current == null) { // list is empty
			head = node; // make newly added node as head
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		printList(head);System.out.println();
		return head;

	}

	public static Node insertAtBeginning(Node head, int data) {
		Node node = new Node(data);// create new node

		if (head == null) { // if list is empty make new node as head
			head = node;

		} else { // ad the node to list and make it head
			node.next = head;
			head = node;
		}
		
		printList(head);System.out.println();
		return head;
	}

	public static void insertAfterLocation(Node head, int data, int loc) {

		if (loc == 1) {
			insertAtBeginning(head, data);
		} else if (loc < 1) {
			System.out.println();
			System.out.println("Invalid location");
		} else {
			Node node = new Node(data);
			Node current = head;
			int counter = 1;

			while (counter < loc - 1 && current.next != null) {
				current = current.next;
				counter++;
			}
			if (current.next != null) {
				node.next = current.next;
				current.next = node;
				
				printList(head);System.out.println();
			} else {
				
				System.out.println("Invalid location");System.out.println();
			}

		}

	}
	
	
	/***********Deletion**************/
	public static Node deleteAtBeginning(Node head){
		if(head == null){
			return head;
		}else{
			Node temp=head;
			head=temp.next;
		}
		System.out.println();
		printList(head);
		return head;
	}
	public static Node deleteAtEnd(Node head){
		if(head == null){
			return head;
		}else{
			Node temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next=null;
		}
		
		printList(head);System.out.println();
		return head;
	}
	
	
	
	
	

	/***********Printing**************/
	public static void printList(Node head) {
		Node current = head;
		if (head != null) {
			current = head;
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}

			System.out.print("null");
		}

	}

	public static void main(String[] args) {

		Node head = null;
		head = insertAtLast(head, 5);
		head = insertAtLast(head, 4);
		head = insertAtLast(head, 55);
		

		head = insertAtBeginning(head, 33);
		head = deleteAtEnd(head);
		insertAfterLocation(head, 999, 3);
		


	}

}
