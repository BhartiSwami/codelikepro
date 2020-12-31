package javalove;
import java.util.*;

public class RecursionPower {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int x=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(Power(x,n));
		}
	}
	public static int Power(int x,int n) {
		if(x==0)return 0;
		if(n==0)return 1;
		return Power(x,n-1)*x;
	}
}
