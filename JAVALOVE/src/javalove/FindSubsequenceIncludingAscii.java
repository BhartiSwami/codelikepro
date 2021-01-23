package javalove;
import java.util.*;

public class FindSubsequenceIncludingAscii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String> ans=subsequence(str);
		for(String val:ans) {
			System.out.print(val+" ");
		}
	}
	public static ArrayList<String> subsequence(String str){
		if(str.length()==0) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(" ");
			return list;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subsequence(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr) {
			mr.add(val);
			mr.add(ch+val);
			mr.add((int)ch+val);
		}
		return mr;
	}
}
