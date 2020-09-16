package javalove;

class Lnode{
	int data;
	Lnode next;
	Lnode(int data){
		this.data=data;
		next=null;
	}
}

public class MiddleEleLL {
	Lnode head;
	MiddleEleLL(){
		head=null;
	}
	MiddleEleLL(int data){
		head=new Lnode(data);
	}
	public static void main(String[] args) {
		MiddleEleLL obj=new MiddleEleLL(1);
		obj.head.next=new Lnode(2);
		obj.head.next.next=new Lnode(3);
		obj.head.next.next.next=new Lnode(4);
		obj.head.next.next.next.next=new Lnode(5);
// 		obj.head.next.next.next.next.next=new Lnode(6);
		obj.printt();
		System.out.println(obj.Middle());
	}
	void printt() {
		Lnode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	int Middle() {
		Lnode fptr=head;
		Lnode sptr=head;
		while(fptr!=null && fptr.next!=null ) {
			fptr=fptr.next.next;
			sptr=sptr.next;
		}
		return sptr.data;
	}
}
