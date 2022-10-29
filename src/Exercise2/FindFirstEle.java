package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class FindFirstEle {
 
    public static void main(String[] args) {
 
        List<Integer> names = new ArrayList<Integer>(
				Arrays.asList(11,22,33,44,55,66,77,88,99));
 
         	int first = names.stream().findFirst().get();
 
         	System.out.println("First Element: " + first);
    }
}

//Output:
//	First Element: 11
