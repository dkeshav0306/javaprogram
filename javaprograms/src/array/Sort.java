package array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int a[] = { 1,4,8,11,5,2};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print (a[i]+" ");
		}

		System.out.println();
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}
}
