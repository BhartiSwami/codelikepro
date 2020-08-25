package javalove;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class LeafNode {
	Node root;
	LeafNode(){
		root=null;
	}
	LeafNode(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		LeafNode bt=new LeafNode(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println("The number of leaf node's in this binary tree is:"+" "+leaf(bt.root));
	}
	static int leaf(Node root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		return leaf(root.left)+leaf(root.right);
	}
}
