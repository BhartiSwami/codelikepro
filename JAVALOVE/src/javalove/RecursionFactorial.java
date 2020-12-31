package javalove;
import java.util.*;

public class RecursionFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(Fact(n));
		}
	}
	public static int Fact(int n) {
		if(n==0||n==1)
			return n;
		return Fact(n-1)*n;
	}
}
