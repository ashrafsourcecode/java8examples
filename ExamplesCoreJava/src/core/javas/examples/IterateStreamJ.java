package core.javas.examples;

import java.util.stream.Stream;

public class IterateStreamJ {
	
	public static void main(String[] args) {
		
		Stream.iterate(2, f -> f+1).limit(10).forEach(System.out::println);
	}

}
