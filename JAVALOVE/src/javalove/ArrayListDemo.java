package javalove;
import java.util.*;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();                  //creation of ArrayList
		list.add(10);                                                          //adding new elements to ArrayList
		list.add(20);
		list.add(30);
		System.out.println(list.get(2));                                 //getting the value at particular index
		System.out.println(list.size());                                  //getting the size of our ArrayList
		System.out.println(list);                                         //printing the ArrayList by its base address
		list.set(0,90);                                                      //Setting or replacing the element at the particular index
		System.out.println(list);
		list.remove(1);                                                     //Removing the element from the given index
		System.out.println(list);
		list.add(1,53);
		System.out.println(list);
		System.out.println(list.contains(20));                    //checking if the ArrayList contains that element or not!
		System.out.println(list.get(list.size()-1));                //getting the value at last index
		list.set(list.size()-1,100);                                     //replacing the value of last index
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {                                 //printing the ArrayList by indexed for loop 
			System.out.print(list.get(i)+" ");
		}
		System.out.println();                                         
		for(int i:list) {                                                   //printing the ArrayList by enhanced for loop
			System.out.print(i+" ");
		}
	}
}
