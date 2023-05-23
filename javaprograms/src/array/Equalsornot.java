package array;

import java.util.Arrays;

public class Equalsornot {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {9,8,7,6,5,4,3,2,1,};
		int c[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,a));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(c,a));
	}
}
