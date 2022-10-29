package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class DuplicateNums {
 
    public static void main(String[] args) {
 
        Integer[] nums = new Integer[]{12,22,33,12,22,44,55,44};
 
        // getting unique elements after removing duplicates
        Integer[] distinctNums = Arrays
                .stream(nums)
                .distinct()
                .toArray(Integer[]::new);
 
        // creating List<Integer> with original Integer[] array  elements
        List<Integer> originalNumsList = new ArrayList<Integer>(
                Arrays.asList(nums));
 
        // getting duplicate elements
        for (Integer distinctNum : distinctNums) {
            originalNumsList.remove(distinctNum);
        }
 
        // printing duplicate elements
        System.out.println("Duplicate elements are: ");
        originalNumsList.forEach(System.out::println);
    }
}

//Output:
//	Duplicate elements are: 
//		12
//		22
//		44
