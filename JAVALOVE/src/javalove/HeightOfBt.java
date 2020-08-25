package javalove;
import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
public class HeightOfBt {
	Node root;
	HeightOfBt(){
		root=null;
	}
	HeightOfBt(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		HeightOfBt bt=new HeightOfBt(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println("Height of this binary tree is:"+" "+ Height(bt.root));
	}
	static int Height(Node root) {
		if(root==null || (root.left==null && root.right==null))                      //or  if(root==null) return -1;
			return 0;
		return 1+Math.max(Height(root.left),Height(root.right));
	}
}
