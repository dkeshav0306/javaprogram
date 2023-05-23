package string;

public class ToCharArray {
public static void main(String[] args) {
	String a ="keshav";
	char[] var = a.toCharArray();
	System.out.println(a);
	for(int i=0;i<=a.length();i++) {
		System.out.print(var[i]+" ");
	}

}
}
