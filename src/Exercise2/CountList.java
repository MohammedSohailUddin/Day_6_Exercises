package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class CountList {
 
    public static void main(String[] args) {
 
    	List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8,9));
    	
        long count = list.stream().count();
 
        System.out.println("Count of Numbers is: " + count);
    }
}

//Output:
//	Count of Numbers is: 9
