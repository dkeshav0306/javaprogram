package array;

public class Ascending {

	public static void main(String[] args) {

		int a[] = { 25, 1, 4, 74, 84, 96, 78, 25, 36, 48, 19, 37, 85, 21, 12, 3, 6, 54, 7, 8, 22, 6, 4, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int empty = a[i];
					a[i] = a[j];
					a[j] = empty;
				}

			}
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int empty = a[i];
					a[i] = a[j];
					a[j] = empty;
				}

			}
			System.out.print(a[i] + " ");
		}
		
	}

}
