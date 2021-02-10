package PrintRecursion;
import java.util.*;

public class CoinTossAgain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PossibleAnswers(n,"");
	}
	public static void PossibleAnswers(int n, String ans) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		PossibleAnswers(n-1,ans+"H");
		PossibleAnswers(n-1,ans+"T");
	}
}
