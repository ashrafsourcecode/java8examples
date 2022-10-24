package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countfrequency {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "abc", "bcd", "abch", "defg", "jk");
		
		System.out.println(strList.stream().collect(Collectors.groupingBy
				(Function.identity(), Collectors.counting())));
		
	}

}
