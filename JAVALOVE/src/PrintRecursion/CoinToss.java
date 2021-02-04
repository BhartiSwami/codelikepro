package PrintRecursion;
import java.util.*;


public class CoinToss {
	
	public static void PrintPossibilities(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		PrintPossibilities(n-1,ans+"H");
		PrintPossibilities(n-1,ans+"T");
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrintPossibilities(n,"");
	}

}
