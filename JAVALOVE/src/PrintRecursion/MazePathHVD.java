package PrintRecursion;
import java.util.*;

public class MazePathHVD {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int er=sc.nextInt();
		int ec=sc.nextInt();
		PossibleWays(0,0,er,ec,"");
	}
	public static void PossibleWays(int cr,int cc,int er,int ec,String ans) {
		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			return;
		}
		if(cr>er ||cc>ec) {
			return;
		}
		PossibleWays(cr,cc+1,er,ec,ans+"H");
		PossibleWays(cr+1,cc,er,ec,ans+"V");
		PossibleWays(cr+1,cc+1,er,ec,ans+"D");
	}
}
