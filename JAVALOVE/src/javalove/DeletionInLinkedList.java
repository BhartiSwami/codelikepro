package javalove;
import java.util.*;

class llNode{
	int data;
	llNode next;
	llNode(int data){
		this.data=data;
		this.next=null;
	}
}
public class DeletionInLinkedList {
	llNode head;
	DeletionInLinkedList(){
		head=null;
	}
	DeletionInLinkedList(int data){
		head=new llNode(data);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DeletionInLinkedList obj=new DeletionInLinkedList(1);
		obj.head.next=new llNode(2);
		obj.head.next.next=new llNode(3);
		obj.head.next.next.next=new llNode(4);
		obj.head.next.next.next.next=new llNode(5);
		obj.head.next.next.next.next.next=new llNode(6);
		obj.Print();
		System.out.println("Enter the position to delete the element");
		int position=sc.nextInt();
		obj.Deletion(position);
		obj.Print();
	}
	void Print() {
		llNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void Deletion(int pos) {
		llNode temp=head;
		int len=0;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		if(head==null){
			System.out.println("Nothing to delete");
			return;
		}
		else if(pos<0 || pos>len) {
			System.out.println("Give a valid input");
		}
		else if(pos==1 && len==1) {
			head=null;
		}
		else if(pos==1){
			head=head.next;
		}
		else {
			llNode tempo=head;
			for(int i=0;i<pos-2;i++) {
				tempo=tempo.next;
			}
			tempo.next=tempo.next.next;
		}
	}
}
