package string;

public class Equals {
	public static void main(String[] args) {
		String a = "keshav";
		String b = new String("keshav");

		String c = "keshav";
		System.out.println(a == c);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
