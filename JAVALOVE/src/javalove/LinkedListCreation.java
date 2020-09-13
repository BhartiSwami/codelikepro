package javalove;

class lNode{
	int data;
	lNode next;
	lNode(int data){
		this.data=data;
		next=null;
	}
}
public class LinkedListCreation {
	lNode head;
	LinkedListCreation(){
		head=null;
	}
	LinkedListCreation(int data){
		head=new lNode(data);
	}
	public static void main(String[] args) {
		LinkedListCreation ll=new LinkedListCreation(1);
		ll.head.next=new lNode(2);
		ll.head.next.next=new lNode(8);
		ll.head.next.next.next=new lNode(4);
		ll.head.next.next.next.next=new lNode(5);
		ll.PrintLL();
	}
	void PrintLL() {
		lNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
