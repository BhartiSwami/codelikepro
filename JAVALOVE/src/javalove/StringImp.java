package javalove;
import java.util.*;

public class StringImp {
	public static void main(String args[]) {
		String str="hello";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(2,2));
		System.out.println(str.substring(1,5));
		System.out.println(str.substring(2));
		System.out.println(str.substring(5));
		System.out.println(str.substring(0));
		System.out.println(str.indexOf("ll"));
		System.out.println(str.indexOf("Ll"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("hel"));
		System.out.println(str.endsWith("lo"));
		System.out.println(collections.reverse(str));
		
	}
}
