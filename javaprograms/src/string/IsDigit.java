package string;

public class IsDigit {
	public static void main(String[] args) {
		String a = "keshav12dhuriya";
		char ch = a.charAt(6);
		boolean var = Character.isDigit(ch);
		System.out.println(var);
	}
}
