package set;

import java.util.ArrayList;
import java.util.Iterator;

public class T2 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
