package javalove;
import java.util.*;

public class RecursiveAscPrinting {
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
		Print(n-1);
		System.out.println(n);
	}
}
