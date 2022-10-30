package core.javas.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListwithStringMorethan2Characters {
	
	public static void main(String[] args) {
		
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		System.out.println(strList.stream().filter( s -> (s.length()>2)).collect(Collectors.toList()));

	}
	
	

}
