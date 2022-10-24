package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringwitha {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		System.out.println(strList.stream().filter(s ->s.startsWith("a")).collect(Collectors.toList()));
		
	}

}
