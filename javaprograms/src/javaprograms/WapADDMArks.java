package javaprograms;

public class WapADDMArks{
	public WapADDMArks(String name, int phy,int chm,int maths) {
		System.out.println("student name "+name);
		System.out.println("marks of phy "+phy +" marks of chm "+chm+" marks of maths "+maths);
		int total=phy+chm+maths;
		System.out.println("total marks of "+total);
		System.out.println();
	}
	public static void main(String[]args) {
		new WapADDMArks("babubhaiya",80,90,70);
		new WapADDMArks("shyam",80,40,80);
		new WapADDMArks("raju",80,90,88);
	}
}




