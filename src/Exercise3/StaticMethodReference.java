package Exercise3;

interface myInterface1{
	   void greet();
	}
	public class StaticMethodReference {
	   public static void demo() {
	      System.out.println("Sample Static Method Reference");
	   }
	   public static void main(String args[]) {
	      myInterface1 in = StaticMethodReference::demo;
	      in.greet();
	   }
	}
	
//Output:
//	Sample Static Method Reference
