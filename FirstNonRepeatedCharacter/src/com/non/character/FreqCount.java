package com.non.character;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqCount {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,7,98,56,98,3,1);
		
		List<Integer> list1 = Arrays.asList();
		
		Set<Integer> set = new HashSet<>();
		
		LinkedHashMap m = list.stream().
		collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(m);
	}

}
