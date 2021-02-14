package Backtracking;
import java.util.*;

public class QueenPermutations1D {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int queens=sc.nextInt();
		int NoOfBoxes=sc.nextInt();
		Permutations(new boolean[NoOfBoxes],0,queens,"");
	}
	public static void Permutations(boolean boxes[],int qpsf,int tq,String ans) {
		if(qpsf==tq) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
			Permutations(boxes,qpsf+1,tq,ans+"b"+i+"q"+qpsf+" ");
			boxes[i]=false;
			}
		}
	}
}
