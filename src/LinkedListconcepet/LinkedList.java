package LinkedListconcepet;

public class LinkedList {

	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node (int data){
			this.data=data;
			next=null;
		}
	}
	
	public void printlinkedlist() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	
	public static void main(String[] args) {

		LinkedList ll =new LinkedList();
		Node first=ll.new Node(10);
		ll.head=first;
		
		Node second=ll.new Node(20);
		first.next= second;
		
		Node thired =ll.new Node(30);
		second.next=thired;
		
		ll.printlinkedlist();
	}

}
