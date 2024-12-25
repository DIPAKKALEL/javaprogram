package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	static List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();

		for (int i = 1; i <= n; ++i) {

			// Check if i is divisible by both 3 and 5
			if (i % 3 == 0 && i % 5 == 0) {

				// Add "FizzBuzz" to the result list
				result.add("FizzBuzz");
			}

			// Check if i is divisible by 3
			else if (i % 3 == 0) {

				// Add "Fizz" to the result list
				result.add("Fizz");
			}

			// Check if i is divisible by 5
			else if (i % 5 == 0) {

				// Add "Buzz" to the result list
				result.add("Buzz");
			} else {

				// Add the current number as a string to the
				// result list
				result.add(Integer.toString(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 10;
		List<String> result = fizzBuzz(n);
		for (String s : result) {
			System.out.print(s + " ");
		}
	}
}
