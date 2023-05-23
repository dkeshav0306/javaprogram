package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LonkedListtt {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("mango");
		list.add("kivi");
		list.add("banana");
		list.add("apple");

		Iterator loop = list.iterator();
		while (loop.hasNext()) {
			System.out.println(loop.next());
		}
	}
}