package javalove;
import java.util.*;

public class arrayrecprint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printArray(arr,0);
	}
	public static void printArray(int[] arr, int idx) {
		if(idx==arr.length)
			return;
		System.out.print(arr[idx]+" ");
		printArray(arr,idx+1);
	}
}
