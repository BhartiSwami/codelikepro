package javalove;
import java.util.*;


public class findDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Duplicate(arr));
	}
	static int Duplicate(int arr[]) {
		int n=arr.length;
		int farr[]=new int[10];
		for(int i=0;i<n;i++) {
			farr[arr[i]]+=1;
			if(farr[arr[i]]>1) {
				return arr[i];
			}
			
		}
		return -1;
	}
}
