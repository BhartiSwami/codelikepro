package javalove;
import java.util.*;

public class FindSubsequences {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> result=subsequences(str);
		for(String val:result) {
			System.out.print(val+" ");
		}
	}
	public static ArrayList<String> subsequences(String str){
		if(str.length()==0) {
			ArrayList<String> res=new ArrayList<>();
			res.add(" ");
			return res;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subsequences(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr) {
			mr.add(val);
			mr.add(ch+val);
		}
		return mr;
	}
}
