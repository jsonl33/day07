package set;

import java.util.ArrayList;
import java.util.HashSet;

public class T1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> arr = new ArrayList<>();
		
		hs.add("라면");hs.add("김밥");
		hs.add("순대");hs.add("김밥");
		
		arr.add("라면");arr.add("김밥");
		arr.add("순대");arr.add("김밥");
		
		System.out.println(hs);
		System.out.println(arr);
		
		hs.remove("순대");
		System.out.println(hs);
		
	}
}
