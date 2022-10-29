package Exercise3;

interface myInterface2{
	   void greet();
	}
	public class InstanceMethodReference {
	   public void demo() {
	      System.out.println("Sample Instance Method Reference");
	   }
	   public static void main(String args[]) {
	      InstanceMethodReference obj = new InstanceMethodReference();
	      myInterface2 in = obj::demo;
	      in.greet();
	   }
	}
	
//Output:
//	Sample Instance Method Reference
