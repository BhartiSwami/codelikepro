package PrintRecursion;
import java.util.*;

public class CoinTossWithNoConsecutiveHeads {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PossibleOutcomes(n,"",false);
	}
	public static void PossibleOutcomes(int n,String ans,boolean lastcall) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		if(lastcall) {
			PossibleOutcomes(n-1,ans+"T",false);
		}
		else {
			PossibleOutcomes(n-1,ans+"H",true);
			PossibleOutcomes(n-1,ans+"T",false);
			
		}
	}
}
