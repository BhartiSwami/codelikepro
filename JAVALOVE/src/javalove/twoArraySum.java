package javalove;
import java.util.*;

public class twoArraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] one=new int[m];
		int[] two=new int[n];
		for(int i=0;i<m;i++) {
			one[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			two[i]=sc.nextInt();
		}
		System.out.println(sum(one,two));
	}
	public static ArrayList<Integer> sum(int[] one, int[] two){
		ArrayList<Integer> list=new ArrayList<>();
		int i1=one.length-1, i2=two.length-1;
		int carry=0;
		while(i1>=0 || i2>=0) {
			int sum=carry;
			if(i1>=0) {
				sum+=one[i1];
			}
			if(i2>=0) {
				sum+=two[i2];
			}
			carry=sum/10;
			sum%=10;
			list.add(0,sum);
			i1--;
			i2--;
		}
		if(carry>0)
			list.add(0,carry);
		return list;
	}
}
