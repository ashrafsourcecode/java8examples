package core.javas.examples;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	int result = numbers
	  .stream()
	  .reduce(0, (subtotal, element) -> subtotal + element);
	
	System.out.println(result);
	//assertThat(result).isEqualTo(21);
	
	int result2=numbers.stream().reduce(1, (a,b) -> a*a);
	
	System.out.println(result2+" result2");
}
}

