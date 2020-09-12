package javalove;                                                                            
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("Lichi");
		System.out.println(list);
		list.remove(1);
		System.out.println();
		System.out.println("After removing a element by index");
		System.out.println();
		for(String s:list) {
			System.out.println(s);
		}
		list.remove("apple");
		System.out.println();
		System.out.println("By removing a element by value");
		System.out.println();
		for(String i:list) {
			System.out.println(i);
		}
		list.add("watermelon");
		list.add("Pomegranate");
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("apple");
		list1.add("green_Apple");
		list1.add("Lichi");
		System.out.println();
		System.out.println("our 2nd list is:->");
		System.out.println();
		System.out.println(list1);
		Collections.sort(list);
		Collections.sort(list1);
		System.out.println();
		System.out.println("Both lists after sorting");
		System.out.println();
		System.out.println(list);
		System.out.println(list1);
		System.out.println();
		System.out.println("using retainAll function [list.retainAll(list1)]");
		list.retainAll(list1);
		System.out.println();
		System.out.println(list);
		System.out.println();
		list.addAll(list1);
		System.out.println();
		System.out.println(list);
		System.out.println();
		System.out.println("Checking if our list is empty or not!");
		System.out.println(list.isEmpty());
		System.out.println("Checking if our list1 is empty or not!");
		System.out.println(list1.isEmpty());
		System.out.println();
		System.out.println("Size of list");
		System.out.println(list.size());
		System.out.println();
		System.out.println("Size of list1");
		System.out.println(list1.size());
	}
}
