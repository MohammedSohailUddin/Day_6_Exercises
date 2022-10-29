package Exercise2;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
 
public class NonRepeating {
 
  public static void main(String[] args) {
 
    System.out.println("Enter the stream of numbers :");
    Scanner in = new Scanner(System.in); // read from System input
    String input = in.nextLine();
    Character firstNonRepeatingNumber = logic(input);
    System.out.println("The first non-repeating number is: " + firstNonRepeatingNumber);
    in.close();
  }
 
  private static Character logic(String input) {  
        Character result =  input.chars()      //string stream
             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lower-case & then to Character object
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
             .entrySet().stream()  //entry-set stream
             .filter(entry -> entry.getValue() == 1L)
             .map(entry -> entry.getKey())
             .findFirst().get();
        
         return result;    
  }
}

//Output:
//	Enter the stream of numbers :
//		1 1 2 3 4 2 3 5 6 6 5
//		The first non-repeating number is: 4
