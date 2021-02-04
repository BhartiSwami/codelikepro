package PrintRecursion;
import java.util.*;

public class PermutationsOfTheGivenString {
	
	public static void PrintPermutations(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		for(int i=0;i<=ans.length();i++) {
			PrintPermutations(ros,ans.substring(0,i)+ch+ans.substring(i));
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PrintPermutations(str,"");
	}
}
