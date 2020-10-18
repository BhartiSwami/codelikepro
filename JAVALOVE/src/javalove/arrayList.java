package javalove;
import java.util.*;
public class arrayList {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int no_of_testCase=sc.nextInt();
			while(no_of_testCase-->0) {
			ArrayList<Integer> list=new ArrayList<>();
			list.add(5);
			list.add(8);
			list.add(3);
			char input=sc.next().charAt(0);
			if(input=='a') {
				Add_At_End(list,sc.nextInt());
				Print_ArrayList(list);
			}
			if(input=='b') {
				Sort_the_ArrayList(list);
				Print_ArrayList(list);
			}
			if(input=='c') {
				Reverse_the_ArrayList(list);
				Print_ArrayList(list);
			}
			if(input=='d') {
				System.out.println(size_of_ArrayList(list));
			}
			if(input=='e') {
				Print_ArrayList(list);
			}
			if(input=='f') {
				RevOrder(list);
			}
			}
		}
//		static void Print(ArrayList<Integer> list) {
//			for(Integer i:list) {
//				System.out.print(i+" ");
//			}
//		}
		static void Add_At_End(ArrayList<Integer> list,int n) {
			list.add(n);
		}
		static void Sort_the_ArrayList(ArrayList<Integer> list) {
			Collections.sort(list);
		}
		static void Reverse_the_ArrayList(ArrayList<Integer> list) {
			Collections.reverse(list);
		}
		static int size_of_ArrayList(ArrayList<Integer> list) {
			return list.size();
		}
		static void Print_ArrayList(ArrayList<Integer> list) {
			for(Integer i:list) {
				System.out.print(i+" ");
			}
		}
		static void RevOrder(ArrayList<Integer> list) {
			Collections.sort(list,Collections.reverseOrder());
			for(Integer i:list) {
				System.out.print(i+" ");
			}
		}
}
