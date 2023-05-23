package javaprograms;

public class ConstructorChanning {
	public ConstructorChanning() {
		this(true,55);
		System.out.println("3rd line");
	}
	public ConstructorChanning(boolean a , int c) {
		this(5,5);
		System.out.println("2nd line");
	}
	public ConstructorChanning(int a,int b) {
		System.out.println("1st line");
	}
	public static void main(String[] args) {
		new ConstructorChanning();
	}
}
