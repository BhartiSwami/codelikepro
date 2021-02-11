package PrintRecursion;
import java.util.*;


public class PallindromePartitianing {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PrintPartitionedString(str,"");
	}
	public static void PrintPartitionedString(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=1;i<=str.length();i++) {
			if(isPallindrome(str.substring(0,i))) {
			PrintPartitionedString(str.substring(i),ans+str.substring(0,i)+" ");
			}
		}
	}
	public static boolean isPallindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
