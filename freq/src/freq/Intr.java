package freq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Intr {

	public static void main(String[] args) {

		int[] a = { 5, 3, 4, 2, 7, 10 };
		int sum = 0;

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			li.add(a[i]);
		}
		
		System.out.println(li.stream().filter(   s-> (s ==7)).collect(Collectors.toList()));

		int target = 7;

		for (int i = 0; i < a.length; i++) {

			sum = a[0] + a[i + 1];

			System.out.println("sum " + a[i]);

			if (sum == 7) {

				System.out.println(a[0] + "-combination-" + a[i + 1]);
			}

		}

	}

}
