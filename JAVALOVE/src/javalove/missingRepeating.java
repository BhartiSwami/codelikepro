package javalove;
import java.util.*;

public class missingRepeating {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int bre=0;
		for(int i=0;i<n;i++) {
			if(i<n-1) {
			if(arr[i]==arr[i+1]) {
				System.out.println("repeating ="+" "+arr[i]);
				bre=1;
			}
			}
			if(bre==1) {
				i++;
				if(arr[i]!=i+1) {
					System.out.println("missing ="+" "+arr[i]);
				}
			}
		}
	}
}
