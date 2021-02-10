package ArrayListDemo;
import java.util.*;

public class KPC {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String str=Integer.toString(n);
	validCombinations(str,"");
	}
	
	public static void validCombinations(String str,String ans){
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		String val=getString(ch);
		for(int i=0;i<val.length();i++) {
			validCombinations(str.substring(1),ans+val.charAt(i));
		}
	}
	public static String getString(char ch) {
		if(ch=='1')
			return "abc";
		if(ch=='2')
			return "def";
		if(ch=='3')
			return "ghi";
		if(ch=='4')
			return "jk";
		if(ch=='5')
			return "lmno";
		if(ch=='6')
			return "pqr";
		if(ch=='7')
			return "stu";
		if(ch=='8')
			return "vwx";
		if(ch=='9')
			return "yz";
		return"";
	}
}
