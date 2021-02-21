package Backtracking;
import java.util.*;

public class QueenPermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int places=sc.nextInt();
		int queens=sc.nextInt();
		boolean boxes[]=new boolean[places];
		Permutations(boxes,0,queens,"");
	}
	public static void Permutations(boolean boxes[],int qpsf,int tq,String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
				Permutations(boxes,qpsf+1,tq,ans+"b"+(i+1)+"q"+(qpsf+1)+" ");
				boxes[i]=false;
			}
		}
	}
}
