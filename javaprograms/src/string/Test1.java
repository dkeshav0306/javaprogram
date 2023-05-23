package string;

public class Test1 {
public static void main(String[] args) {
	String a = "this is the thing";
	String[] var = a.split("\\s");
	for(String newa:var) {
		if(newa.contains("th"))
		System.out.println(newa);
	}
}
}
