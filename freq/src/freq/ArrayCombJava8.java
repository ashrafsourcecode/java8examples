package freq;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ArrayCombJava8 {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bi = (x, y) -> {
			return (x + y) == 7;
		};

		List<Integer> list = new ArrayList<Integer>();

		// add elements to the list
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int a[] = { 1, 5, 3, 8, 6, 4 };
		
		List<Integer> list1  =list.stream()
        .filter(x -> bi.test(a[0], a[4]))
        .collect(Collectors.toList());
		
		System.out.println(list1);
		
	}

}
