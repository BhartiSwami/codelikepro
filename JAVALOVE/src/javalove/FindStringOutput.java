package javalove;
import java.util.*;

public class FindStringOutput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n1=sc.next();
		int n2=sc.nextInt();
		System.out.println(findCharsOrDigitSum(n1,n2));
	}
	public static String findCharsOrDigitSum(String input1,int input2){
		String result="ZERO";
		int sum=0;
		String  res="";
		for(int i=0;i<input1.length();i++) {
			if(input2==0) {
				if(Character.isDigit(input1.charAt(i))) {
					sum+=(int)input1.charAt(i);
				}
			}
			if(input2==1) {
				if(!Character.isDigit(input1.charAt(i))) {
					res=res+input1.charAt(i);
				}
				
			}
		}
		if(res!="") {
			return res;
		}
		else if(sum!=0){
			return Integer.toString(sum);
		}
		else {
			return result;
		}
	}
}
