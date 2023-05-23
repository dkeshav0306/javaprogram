package string;

public class Split {
public static void main(String[] args) {
	String a= "my name is keshavendra dhuriya";
	String[]  var = a.split("\\s");
	for(String abc:var) {
		System.out.println(abc);
	}
}
}
