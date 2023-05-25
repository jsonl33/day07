package array_list;

import java.util.ArrayList;

public class T1 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		System.out.println(arr.size());
		arr.add("1111");
		arr.add("2222");
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		
		System.out.println(arr.contains("2222"));
		System.out.println(arr.contains("2221"));
		
		System.out.println(arr);
//		arr.remove("1111");
		arr.remove(0);
		System.out.println(arr);
		
	}
}
