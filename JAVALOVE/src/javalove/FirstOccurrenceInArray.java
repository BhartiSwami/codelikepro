package javalove;
import java.util.*;

public class FirstOccurrenceInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println(FirstOccurrence(arr,0,key));
	}
	public static int FirstOccurrence(int[] arr,int idx,int key) {
		if(idx==arr.length)
			return -1;
		if(arr[idx]==key)
			return idx;
		else
		return FirstOccurrence(arr,idx+1,key);
	}
}
