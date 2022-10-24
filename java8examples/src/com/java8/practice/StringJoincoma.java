package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoincoma {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		String G7Countries = strList.stream().filter( s -> !s.isEmpty()).collect(Collectors.joining("^^ "));
		
		System.out.println(G7Countries);
	}

}
