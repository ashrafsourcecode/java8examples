package core.javas.examples;

import java.util.Arrays;

public class StringsManipulation {
	
	public static void main(String[] args) {
		
		
	 String[] strings = {"a", "b", "c", "d", "e"};
	
	  // |a|b|c|d|e , the initial | join is not what we want
	 
	 String reduces =Arrays.stream(strings).reduce("", (s,b)-> (s+"|"+b));
	 
	 System.out.println(reduces);
	 
	 String reduces2 =String.join("|", strings);
	 
	 System.out.println("--> "+reduces2);
	}
}

