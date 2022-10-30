package core.javas.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListofSquareDistinctNum {
	// Create a List of the square of all distinct numbers

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(3, 3, 4, 6, 7, 7, 9);
		
		
		System.out.println(listInt.stream().map(s->s*s).distinct().collect(Collectors.toList()));
		
		
	}

}
