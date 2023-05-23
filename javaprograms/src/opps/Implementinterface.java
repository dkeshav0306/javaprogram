package opps;

public class Implementinterface  implements abc{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	public static void main(String[] args) {
		Implementinterface obj  = new Implementinterface();
		obj.m1();
		obj.m2();
		abc.k3();
	}
	
		
	
}
