package ArrayListDemo;
import java.util.*;

public class SubsequencesWithAscii {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String dummy=str;
		PrintSubsequences(dummy,"");
	}

	public static void PrintSubsequences(String str, String ans) {
		
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		PrintSubsequences(str.substring(1),ans);
		PrintSubsequences(str.substring(1),ans+str.charAt(0));
		PrintSubsequences(str.substring(1),ans+(int)str.charAt(0));
		
	}

}
