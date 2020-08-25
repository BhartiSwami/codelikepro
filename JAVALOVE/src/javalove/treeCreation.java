package javalove;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class treeCreation {
    Node root;
    treeCreation(){
        root=null;
    }
    treeCreation(int data){
        root=new Node(data);
    }
	public static void main (String[] args) {
		treeCreation bt=new treeCreation();
		bt.root=new Node(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		Syst em.out.println("tree created successfully");
	}
}
