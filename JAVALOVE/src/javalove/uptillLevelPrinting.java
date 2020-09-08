 package javalove;

 class Node{
	 Node left;
	 Node right;
	 int data;
	 Node(int data){
		 this.data=data;
		 left=null;
		 right=null;
	 }
 }
public class uptillLevelPrinting {
	Node root;
	uptillLevelPrinting(){
		root=null;
	}
	uptillLevelPrinting(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		int level=1;
		uptillLevelPrinting head=new uptillLevelPrinting(2);
		head.root.left=new Node(3);
		head.root.right=new Node(5);
		head.root.left.right=new Node(9);
		head.root.right.left=new Node(7);
		levelPrinting(head.root,level);
	}
	static void levelPrinting(Node root,int level) {
		if(root==null)
			return;
		if(level>=0) {
			System.out.println(root.data+" ");
		}
		levelPrinting(root.left, level-1);
		levelPrinting(root.right, level-1);
	}
}

