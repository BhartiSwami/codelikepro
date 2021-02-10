package PrintRecursion;
import java.util.*;

public class ClimbingStairs {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		waysForReaching(0,n,"");
	}
	public static void waysForReaching(int curr,int n,String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n) {
			return;
		}
//		waysForReaching(curr+1,n,ans+"1");
//		waysForReaching(curr+2,n,ans+"2");
//		waysForReaching(curr+3,n,ans+"3");
		for(int i=1;i<=3;i++) {
			waysForReaching(curr+i,n,ans+i);
		}
	}
}
