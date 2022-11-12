package com.test;

import java.util.Optional;

public class EmptyOptChk {
	public static void main(String[] args) {

		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index
		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.of(str[5]);
		
		
		System.out.println(empty.isPresent());
		
		System.out.println(empty.orElse("test"));
	}

}
