package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class SortList {
 
    public static void main(String[] args) {
 
    	List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(110,2,34,4,5,66,7,83,99));
    	List<Integer> sortedNumbers = list
                .stream()
                .sorted()
                .collect(Collectors.toList());
    	System.out.println("Sorted Order: ");
        sortedNumbers.forEach(System.out::println);
    }
}

//Output:
//	Sorted Order: 
//		2
//		4
//		5
//		7
//		34
//		66
//		83
//		99
//		110
