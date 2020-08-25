package javalove;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
public class TreeSum {
	Node root;
	TreeSum(){
		root=null;
	}
	TreeSum(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		TreeSum ts=new TreeSum();
		ts.root=new Node(2);
		ts.root.left=new Node(3);
		ts.root.right=new Node(5);
		ts.root.left.right=new Node(9);
		ts.root.right.left=new Node(7);
		System.out.println("The Sum of given Tree is"+" "+btSum(ts.root));
	}
	static int btSum(Node root) {
		if(root==null)
			return 0;
		return root.data+btSum(root.left)+btSum(root.right);
	}
}
