package ArrayListDemo;
import java.util.*;

public class Demo {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
		list.add(temp);
		System.out.println(list);
		temp.add(10);
		temp.add(20);
		temp.add(30);
		list.add(temp);
		temp.add(40);
		temp.add(50);
		list.add(temp);
		list.add(temp);
		temp.add(60);
		temp.add(70);
		list.add(temp);
		System.out.println(list);
	}
}
