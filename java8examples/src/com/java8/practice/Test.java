package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Employee[] arrayOfEmps = { 
				new Employee(1, "Jeff Bezos", 100000.0), 
				new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0) 
				};
		//System.out.println("test");
		//System.out.println(Stream.of(arrayOfEmps));
		List<Employee> al = Arrays.asList(arrayOfEmps);
		al.stream();

		Stream.of(arrayOfEmps[0], arrayOfEmps[1]);
		
		Stream.Builder<Employee> emp = Stream.builder();
		
		emp.accept(arrayOfEmps[0]);
		
		Stream<Employee> emps = emp.build();
		
		al.stream().forEach( e -> e.salaryI(10));
		
		System.out.println(al);

	}

}
