package BinaryTree;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
public class BTCreation {
	
	Node root;
	BTCreation(){
		root=null;
	}
	BTCreation(int data){
		this.root=new Node(data);
	}
	public static void main(String []args) {
	BTCreation bt=new BTCreation(2);
	bt.root.left=new Node(3);
	bt.root.right=new Node(5);
	bt.root.left.right=new Node(9);
	bt.root.right.left=new Node(7);
	}
	
	
}
