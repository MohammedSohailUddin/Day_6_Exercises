package Exercise2;

import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<Integer> EvenNumbers = list
									.stream()
									.filter(i -> i%2 == 0)
									.collect(toList());
		System.out.println("Even ArrayList Integers: "+EvenNumbers);
	}
}

//Output:
//	Even ArrayList Integers: [2, 4, 6, 8]
