package PrintRecursion;
import java.util.*;


public class Subsequences {
	public static void PrintAllSubsequences(String ques, String ans) {
		if(ques.length()==0) {                                           //Base case
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);                                      //taking first character of the string
		String roq=ques.substring(1);                              //rest of the string except first character
		PrintAllSubsequences(roq,ans);                           //Prints all the subsequences where ch is not present
		PrintAllSubsequences(roq,ans+ch);                       //Prints all the possible subsequences in which ch is present
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();         //Input string for finding its subsequences
		PrintAllSubsequences(str,"");           //calling function to print all the subsequences of the given string
	}

}
