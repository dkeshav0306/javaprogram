package array;

public class MinimumNo {
	public static  int m1(int[] a) {
		int g = a[0];
		for (int i = 1; i < a.length; i++) {
			if (g > a[i]) {
				g = a[i];
		
			}
			
		}
		return g;
	}

	public static int m2(int[] a) {
		int k = a[0];
		for (int i = 1; i < a.length; i++) {
			if (k < a[i]) {
				k = a[i];
		
			}
			
		}
	return k;
	}
	
	public static void main(String[] args) {
	
		
		int a[] = { 45,225,1,566,55,6 };
	int k= m2(a);
		System.out.println("maximum value from array "+k);

		int g =m1(a);
		System.out.println("minimum value from array "+g);
	}

}
