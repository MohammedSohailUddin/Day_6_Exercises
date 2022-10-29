package Exercise2;

import java.util.ArrayList;
import java.util.List;
public class StartsWith1 {
   public static void main(String args[]) {
      List<String> list = new ArrayList<String>();
      list.add("112");
      list.add("121");
      list.add("234");
      list.add("320");
      list.add("657");
      list.add("109");
      list.add("678");
      list.add("101");
      System.out.println("List beginning with 1: ");
      list.stream().filter((x) -> x.startsWith("1"))
      .forEach(System.out::println);
   }
}

//Output:
//	List beginning with 1: 
//		112
//		121
//		109
//		101
