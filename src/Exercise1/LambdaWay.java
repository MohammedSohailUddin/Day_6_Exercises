package Exercise1;
import java.util.*;

public class LambdaWay{

	public static void main (String[] args){
		//Lambda Way
		TreeSet<Student> set = new TreeSet<Student>((s1,s2) ->(s1.getMarks() - s2.getMarks()));
		
		set.add(new Student(400,"Adam"));
		set.add(new Student(300,"David"));
		set.add(new Student(100,"Chris"));
		set.add(new Student(200,"Bobby"));
		
		System.out.println("Sorted Order of Student Marks:");
		System.out.println();
		for(Student ele: set)
		{
			System.out.print(ele.getName()+" "+ele.getMarks());
			System.out.println();
		}
	}
}

//Output:
//	Sorted Order of Student Marks:
//
//		Chris 100
//		Bobby 200
//		David 300
//		Adam 400

