package array;

public class Literal {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= 4; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("revArray");
	
		for (int i = 4; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
