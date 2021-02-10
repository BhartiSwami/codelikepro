package PrintRecursion;
import java.util.*;

public class MazePath {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int er=sc.nextInt();
		int ec=sc.nextInt();
		WaysToReach(0,0,er,ec,"");
		
	}
	public static void WaysToReach(int cr,int cc,int er,int ec,String ans) {
		if(cr==er &&cc==ec) {
			System.out.print(ans+" ");
			return;
		}
		if(cr>er ||cc>ec)
			return;
		WaysToReach(cr,cc+1,er,ec,ans+"H");
		WaysToReach(cr+1,cc,er,ec,ans+"V");
	}

}
