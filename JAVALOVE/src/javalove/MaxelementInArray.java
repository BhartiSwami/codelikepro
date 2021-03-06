package javalove;
import java.util.*;

public class MaxelementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxElement(arr,0));
	}
	public static int maxElement(int[] arr,int idx) {
		if(idx==arr.length)
			return 0;
		return Math.max(arr[idx], maxElement(arr,idx+1));
	}
}
