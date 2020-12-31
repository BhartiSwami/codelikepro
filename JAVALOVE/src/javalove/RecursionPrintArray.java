package javalove;
import java.util.*;

public class RecursionPrintArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Print(arr,0);
		}
	}
	public static void Print(int[] arr, int idx) {
		if(idx==arr.length)
			return;
		System.out.print(arr[idx]+" ");
		Print(arr,idx+1);
		}
}
