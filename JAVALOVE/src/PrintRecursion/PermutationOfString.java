package PrintRecursion;
import java.util.*;

public class PermutationOfString {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PermutationsPrint(str,"");
	}
	public static void PermutationsPrint(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			PermutationsPrint(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
		}
	}

}
