package opps;

public class Build2 extends Build1{

	@Override
	void mutrualfund() {
		// TODO Auto-generated method stub
		System.out.println("implementation");
	}

	public static void main(String[] args) {
		Build1 obj = new Build2();
		obj.stockExchange();
		obj.mutrualfund();
	
	}
}
