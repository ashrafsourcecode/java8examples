package freq;

public class ArrayCheck {

	public static void main(String[] args) {

		int a[] = { 1, 5, 3, 8, 6, 4 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				sum = a[i] + a[j];
				if (sum == 7) {

					System.out.println("combination " + a[i] + "---->" + a[j]);
				}

			}
		}

	}

}
