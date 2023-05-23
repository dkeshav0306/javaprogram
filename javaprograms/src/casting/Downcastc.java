package casting;

public class Downcastc extends Downcastp {
public void m3() {
	System.out.println("m3");
}
	public static void main(String[] args) {
		
		Downcastp pref = new Downcastc();
		Downcastc cref = (Downcastc)pref;
		cref.m1();
		cref.m2();
		cref.m3();
	}
}
