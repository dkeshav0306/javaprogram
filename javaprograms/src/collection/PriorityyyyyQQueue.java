package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityyyyyQQueue {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();

		q.add("JackFruit");
		q.add("Mango");
		q.add("Apple");
		q.add("banana");
		q.add("Grapes");
		q.add("kivi");

		q.add("orange");

		System.out.println("Head: " + q.element());
		System.out.println("Head: " + q.peek());

		/*
		 * Iterator<String> iterator = q.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		q.remove();
		System.out.println("Head: " + q.element());

		q.poll();
		Iterator<String> iterator2 = q.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
