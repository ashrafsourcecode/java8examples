package core.javas.examples;

public class Sample_String {
	public static void main(String[] args) {
		String str_Sample = "a";
		System.out.println("Compare To 'a' b is : " + "a".compareTo("b"));
		str_Sample = "b";
		System.out.println("Compare To 'b' a is : " + "a".compareTo("a"));
		str_Sample = "b";
		System.out.println("Compare To 'b' b is : " + "b".compareTo("a"));
	}
}