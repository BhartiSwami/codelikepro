package PrintRecursion;
import java.util.*;

public class LexographicalCounting {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrintCounting(0,n);
	}
	public static void PrintCounting(int curr,int n) {
		if(curr>n)
			return;
		System.out.print(curr+" ");
		int i=0;		
		if(curr==0)
			i=1;
		while(i<=9) {
			PrintCounting(curr*10+i,n);
			i++;
		}
	}
}
