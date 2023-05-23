package array;

import java.util.Arrays;

public class Dubval {
	public static void main(String[] args) {
		int a[]= {1,14,5,1,5,14,3,8,8,86,87,88,88};
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) 
		System.out.print(a[i]+" ");
		System.out.println();
		for(int i = 0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) { 
				if(a[i] == a[j]) {
					System.out.print(a[i]+ " ");
					
				}
			}
		}
	}
}
