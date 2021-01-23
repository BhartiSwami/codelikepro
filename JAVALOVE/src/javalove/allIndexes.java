package javalove;
import java.util.*;

public class allIndexes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int res[]=FindIndexes(arr,key);
		for(int i=0;i<res.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] FindIndexes(int arr[],int key) {
		int count=0,idx=0;
		int res[]=indexes(arr,idx,key,count);
		return res;
	}
	public static int[] indexes(int arr[],int idx,int key,int count) {
		if(idx==arr.length) {
			int res[]=new int[count];
			return res;
		}
		int rr[];int j;
		if(arr[idx]==key) {
			arr[count]=idx;
			rr=indexes(arr,idx+1,key,count+1);
			return rr;
		}
		else {
			rr=indexes(arr,idx+1,key,count);
			return rr;
		}
	}
}
