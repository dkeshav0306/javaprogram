package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Listtt {

	public static void main(String[] args) {
		
		ArrayList<String>	list = new ArrayList<String>();
		list.add("mango");
		list.add("kivi");
		list.add("banana");
		list.add("apple");
		
		//Iterator loop =list.iterator();
	//	while(loop.hasNext()) {
			//System.out.println(loop.next());
			for(String newlist:list) {
				System.out.println(newlist);
			}
			
		//}
	}


}
