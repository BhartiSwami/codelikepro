package javalove;
import java.util.*;

public class twoArrayIntersection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int[] one=new int[l1];
		int[] two=new int[l2];
		for(int i=0;i<l1;i++) {
			one[i]=sc.nextInt();
		}
		for(int i=0;i<l2;i++) {
			two[i]=sc.nextInt();
		}
		System.out.print(intersection(one,two));
	}
	public static ArrayList<Integer> intersection(int[] one, int[] two){
		ArrayList<Integer> list=new ArrayList<>();
		int l1=one.length;
		int l2=two.length;
		int i1=0, i2=0;
		while(i1<l1 && i2<l2) {
			if(one[i1]==two[i2]) {
				list.add(one[i1]);
				i1++;
				i2++;
			}
			else if(one[i1]>two[i2]) {
				i2++;
			}
			else {
				i1++;
			}
		}
		return list;
	}
}
