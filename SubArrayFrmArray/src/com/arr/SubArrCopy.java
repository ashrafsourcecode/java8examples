package com.arr;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArrCopy {

	public static void main(String[] args) {

		int a[] = IntStream.of(12, 67, 88, 56, 39).toArray();

		int begin = 1, end = 4;
		
		Integer[] subarray=IntStream.range(begin, end).mapToObj(i-> a[i]).limit(2).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(subarray));
		
		
	}

}
