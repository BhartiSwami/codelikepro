package javalove;
import java.util.*;

class llNode{
	int data;
	llNode next;
	llNode(int data){
		this.data=data;
		next=null;
	}
}

public class LLInsertion {
	llNode head;
	LLInsertion(){
		head=null;
	}
	LLInsertion(int data){
		head=new llNode(data);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  	    LLInsertion obj=new LLInsertion(1);
		obj.head.next=new llNode(2);
		obj.head.next.next=new llNode(3);
		obj.head.next.next.next=new llNode(4);
		obj.head.next.next.next.next=new llNode(5);
		System.out.println("Before Insertion our Linked List is:");
		obj.Print();
		System.out.println("Enter the position and data for insertion");
		int pos=sc.nextInt();
		int data=sc.nextInt();
		obj.Insert(pos,data);
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
	
	void Insert(int pos, int data) {
		if(head==null) {
			return;
		}
		llNode temp=head;
		int len=0;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		if(pos<0 ||pos>len) {
			System.out.println("Enter a valid input");
			return;
		}
		if(pos==0) {
			llNode newNode=new llNode(data);
			newNode.next=head;
			head=newNode;
		}
		else if(pos==len) {
			llNode newNode=new llNode(data);
			llNode tempo=head;
			while(tempo.next!=null) {
				tempo=tempo.next;
			}
			tempo.next=newNode;
		}
		else {
			llNode newNode=new llNode(data);
			llNode temporary=head;
			for(int i=0;i<=pos-1;i++) {
				temporary=temporary.next;
			}
			newNode.next=temporary.next;
			temporary.next=newNode;
		}
	}
}
