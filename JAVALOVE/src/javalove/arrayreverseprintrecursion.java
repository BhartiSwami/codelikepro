package javalove;
import java.util.*;
public class arrayreverseprintrecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printarray(arr,0);
	}
	public static void printarray(int[] arr,int idx) {
		if(idx==arr.length)
			return;
		printarray(arr,idx+1);
		System.out.print(arr[idx]+" ");
	}
}
