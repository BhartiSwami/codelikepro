package javalove;
import java.util.*;

class findDuplicateOptimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("The repeating elemnet is:"+" "+ Duplicate(arr));
		}
	}
	static int Duplicate(int []arr) {
		int tortoise=arr[0];
		int hare=arr[0];
		do{
			tortoise=arr[tortoise];
			hare=arr[arr[hare]];
		}while(tortoise!=hare);
		hare=arr[0];
		while(tortoise!=hare) {
			tortoise=arr[tortoise];
			hare=arr[hare];
		}
		return hare;
	}
}
