package javalove;
import java.util.*;

public class MissRep {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			MissingRepeatingElee(arr,n);
		}
	}
	static void MissingRepeatingElee(int arr[],int n) {
		Arrays.sort(arr);
		int missing=-1, repeating=-1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				repeating=arr[i];
			}
			if(arr[i]!=arr[i+1] && arr[i+1]!=arr[i]+1) {
				missing=arr[i]+1;
			}
		}
		System.out.println("missing = "+ " "+missing+" "+"Repeating = "+" "+repeating);
	}
}
