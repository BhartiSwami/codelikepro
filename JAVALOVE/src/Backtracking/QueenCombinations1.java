package Backtracking;
import java.util.*;


public class QueenCombinations1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int boxes=sc.nextInt();
		int queens=sc.nextInt();
		PrintAllCombinations(new boolean[boxes],0,queens,0,"");
	}
	public static void PrintAllCombinations(boolean[] boxes,int qpsf,int tq,int idx,String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
				PrintAllCombinations(boxes,qpsf+1,tq,idx+1,ans+"b"+(i+1)+"q"+(qpsf+1)+" ");
				boxes[i]=false;
			}
		}
	}
}
