package javalove;
import java.util.*;

public class RecursionDecInc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			Print(n);
		}
	}
	public static void Print(int n) {
		if(n==0)
			return;
		System.out.println(n);
		Print(n-1);
		System.out.println(n);
	}
}
