package PrintRecursion;
import java.util.*;

public class PermutationOfStringWay2 {
	
	public static void PrintPermutations(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			PrintPermutations(roq,ans+ch);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PrintPermutations(str,"");
	}
}
