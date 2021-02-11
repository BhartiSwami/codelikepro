package PrintRecursion;
import java.util.*;

public class GenerateParenthesis {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ValidParenthesis(0,0,n,"");
	}
	public static void ValidParenthesis(int open,int close,int n,String ans) {
		if(open==n && close==n) {
			System.out.print(ans+" ");
			return;
		}
		if(open>n || close>open) {
			return;
		}
		ValidParenthesis(open+1,close,n,ans+"(");
		ValidParenthesis(open,close+1,n,ans+")");
	}

}
