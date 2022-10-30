package core.javas.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringtoUppercaseJoinwithComa {

	public static void main(String[] args) {

		
		  List<String> strList = Arrays.asList("abc",  "bcd", "defg", "jk");
		  
		  
		  System.out.println(strList.stream().map(s->s.toUpperCase().join(",",
		  s)).collect(Collectors.toList()));
		 

		/*
		 * List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy",
		 * "U.K.", "Canada"); String G7Countries = G7.stream().map(x ->
		 * x.toUpperCase()).collect(Collectors.joining(", "));
		 * 
		 * System.out.println(G7Countries);
		 */

	}

}
