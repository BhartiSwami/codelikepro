package javalove;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class NoOfNodes {
	Node root;
	NoOfNodes(){
		root=null;
	}
	NoOfNodes(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		NoOfNodes bt=new NoOfNodes();
		bt.root=new Node(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println("The Number of Nodes in this binary tree is:"+" "+Nodes(bt.root));
	}
	static int Nodes(Node root) {
		if(root==null)
			return 0;
		return 1+Nodes(root.left)+Nodes(root.right);
	}
}
