package singlyLinkedList;





public class Reversal {

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

	public static Node reverse(Node head){
		Node prev = null;
		Node current = head;
		Node ahead = null;
		
		while(current!=null){
			ahead=current.next;
			current.next=prev;
			prev=current;
			current=ahead;
		}
		head=prev;
		
		
		
		printList(head);
		return head;
	}
	public static void main(String[] args) {
		Node head=null;
		head=insertAtLast(head, 12);
		head=insertAtLast(head, 13);
		head=insertAtLast(head, 14);
		
		head=reverse(head);
		

	}

}
