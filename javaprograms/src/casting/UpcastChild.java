package casting;

public class UpcastChild extends Upcast_parent {
public static void m3() {
	System.out.println("child m3");
}

public static void main(String[] args) {
	Upcast_parent childobj = new UpcastChild();
	childobj.m1();
	childobj.m2();
	m3();
	Upcast_parent pobj = (Upcast_parent)childobj;
	pobj.m1();
	pobj.m2();
	m3();
}
}
