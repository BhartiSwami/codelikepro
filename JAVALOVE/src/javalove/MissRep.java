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
		int fr[]=new int[n+1];
		int missing=-1,repeating=-1;
		for(int i=0;i<n;i++) {
			 fr[arr[i]]+=1;
		}
		for(int i=0;i<n;i++) {
			if(fr[i]>1) {
				repeating=i;
			}
			if(fr[i]==0) {
				missing=i;
			}
		}
		System.out.println("Missing=" +" "+missing+" "+"Repeating"+" "+repeating);
	}
}
