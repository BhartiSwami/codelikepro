package PrintRecursion;
import java.util.*;

public class KeyPadCombinations {
	static int count=0;
	public static String getBoundedString(char ch) {
		
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
			return "";
	}
	
	public static void FindPossibleOutputs(String key,String ans) {
		if(key.length()==0) {
			System.out.println(++count+"."+" "+ans);
			return;
		}
		char ch=key.charAt(0);                         //first character of key
		String rok=key.substring(1);                 //rest of key except the first character
		String str=getBoundedString(ch);         //associated string from the character whose characters can come after pressing the key
		for(int i=0;i<str.length();i++) {
		FindPossibleOutputs(rok,ans+str.charAt(i));
		}
	}
	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();                                  //taking input of keypad combination key from user
		String keys=Integer.toString(key);               //converting the key into string form for easy operations
		FindPossibleOutputs(keys,"");
	}
	

}
