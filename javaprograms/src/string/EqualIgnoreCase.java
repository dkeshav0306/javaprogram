package string;

public class EqualIgnoreCase {

	public static void main(String[] args) {
		String a="keshav";
		String b ="KESHAV";
		
		System.out.println(a.equalsIgnoreCase(b));
		boolean var = a.equalsIgnoreCase(b);
		System.out.println(var);
	
	}
}
