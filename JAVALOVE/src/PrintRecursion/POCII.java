package PrintRecursion;
import java.util.*;

public class POCII {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Permutations(str,"");
		
	}
	public static void Permutations(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<=ans.length();i++) {
			Permutations(str.substring(1),ans.substring(0,i)+str.charAt(0)+ans.substring(i));
		}
	}

}
