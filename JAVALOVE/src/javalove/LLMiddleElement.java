package javalove;

class llNode{
	int data;
	llNode next;
	llNode(int data){
		this.data=data;
		next=null;
	}
}
public class LLMiddleElement {
	llNode head;
	LLMiddleElement(){
		head=null;
	}
	LLMiddleElement(int data){
		head=new llNode(data);
	}
	public static void main(String[] args) {
		LLMiddleElement obj=new LLMiddleElement(1);
		obj.head.next=new llNode(2);
		obj.head.next.next=new llNode(3);
		obj.head.next.next.next=new llNode(4);
		obj.head.next.next.next.next=new llNode(5);
		obj.head.next.next.next.next.next=new llNode(5);
		obj.printt();
		System.out.println(obj.Middle(obj.height()));
	}
	int height() {
		int count=0;
		llNode temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	int Middle(int count) {
		llNode temp=head;
		for(int i=0;i<count/2;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	void printt() {
		llNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
