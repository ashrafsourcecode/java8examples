package com.java8.practice;

import java.util.Arrays;
import java.util.List;

public class EmptyStringCount {
	
	public static void main(String[] args) {
		
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		long emptyCount = strList.stream().filter( c -> c.isEmpty()).count();
		
		System.out.println(emptyCount);

	}

}
